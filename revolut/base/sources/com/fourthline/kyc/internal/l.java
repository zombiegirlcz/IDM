package com.fourthline.kyc.internal;

import com.fourthline.kyc.zipper.ZipperError;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f26558b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f26559a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public l(File zipFilesFolder) {
        Intrinsics.checkNotNullParameter(zipFilesFolder, "zipFilesFolder");
        this.f26559a = zipFilesFolder;
    }

    public final URI a(InputStream inputStream, UUID zipUuid) throws ZipperError.ZipExceedMaximumSize, ZipperError.NotEnoughSpace {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(zipUuid, "zipUuid");
        File file = new File(this.f26559a, "kyc" + zipUuid + ".zip");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                zi0.c.m(inputStream, fileOutputStream, 8192);
                fileOutputStream.close();
                if (file.length() > 209715200) {
                    throw ZipperError.ZipExceedMaximumSize.INSTANCE;
                }
                URI uri2 = file.toURI();
                Intrinsics.checkNotNullExpressionValue(uri2, "with(...)");
                return uri2;
            } finally {
            }
        } catch (IOException unused) {
            file.delete();
            throw ZipperError.NotEnoughSpace.INSTANCE;
        }
    }

    public static /* synthetic */ URI a(l lVar, byte[] bArr, UUID uuid, int i, Object obj2) {
        if ((i & 2) != 0) {
            uuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID(...)");
        }
        return lVar.a(bArr, uuid);
    }

    public final URI a(byte[] data, UUID zipUuid) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(zipUuid, "zipUuid");
        return a(new ByteArrayInputStream(data), zipUuid);
    }
}
