package com.fourthline.vision.internal;

import com.fourthline.vision.internal.m8;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class n8 implements m8 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f36599c = new a(null);
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f36600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f36601b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[m8.a.values().length];
            try {
                iArr[m8.a.f36562a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m8.a.f36563b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public n8(@NotNull File mediaFilesFolder) {
        Intrinsics.checkNotNullParameter(mediaFilesFolder, "mediaFilesFolder");
        this.f36600a = new ArrayList();
        if (mediaFilesFolder.exists()) {
            File[] fileArrListFiles = mediaFilesFolder.listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    Intrinsics.h(file);
                    Intrinsics.checkNotNullParameter(file, "<this>");
                    Intrinsics.checkNotNullParameter("temp_", "other");
                    if (lim.o.q(file, new File("temp_"))) {
                        arrayList.add(file);
                    }
                }
                this.f36600a.addAll(arrayList);
            }
        } else {
            mediaFilesFolder.mkdirs();
        }
        this.f36601b = mediaFilesFolder;
    }

    private final void deleteAll(List<File> list) {
        for (File file : list) {
            try {
                file.delete();
            } catch (IOException unused) {
                if (list.getClass().isAnonymousClass()) {
                    String name = list.getClass().getName();
                    if (name.length() > 23) {
                        Intrinsics.checkNotNullExpressionValue(name.substring(name.length() - 23, name.length()), "substring(...)");
                    }
                } else {
                    String simpleName = list.getClass().getSimpleName();
                    if (simpleName.length() > 23) {
                        Intrinsics.checkNotNullExpressionValue(simpleName.substring(0, 23), "substring(...)");
                    }
                }
                Objects.toString(file);
            }
        }
        Unit unit = Unit.f186387a;
        list.clear();
    }

    @Override // com.fourthline.vision.internal.m8
    @NotNull
    public File createResultFile(@NotNull m8.a type) throws IOException {
        Intrinsics.checkNotNullParameter(type, "type");
        int i = b.$EnumSwitchMapping$0[type.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalArgumentException("At the moment we don't provide separate audio files to clients");
        }
        File file = new File(this.f36601b, "video_" + UUID.randomUUID() + ".mp4");
        file.createNewFile();
        return file;
    }

    @Override // com.fourthline.vision.internal.m8
    @NotNull
    public File createTempFile(@NotNull m8.a type) throws IOException {
        String str;
        Intrinsics.checkNotNullParameter(type, "type");
        File file = this.f36601b;
        int i = b.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            str = "temp_video_" + UUID.randomUUID() + ".mp4";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "temp_audio_" + UUID.randomUUID() + ".aac";
        }
        File file2 = new File(file, str);
        file2.createNewFile();
        this.f36600a.add(file2);
        return file2;
    }

    @Override // com.fourthline.vision.internal.m8
    public void deleteTempFiles() {
        deleteAll(this.f36600a);
    }
}
