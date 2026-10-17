package com.fourthline.orca.internal;

import com.fourthline.orca.internal.z10;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class w10 implements v10 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f34489b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34490c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f34491a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public w10(File assetsFourthlineDirectory) {
        Intrinsics.checkNotNullParameter(assetsFourthlineDirectory, "assetsFourthlineDirectory");
        this.f34491a = assetsFourthlineDirectory;
    }

    @Override // com.fourthline.orca.internal.v10
    public z10 a(r10 key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        File file = new File(y10.a(key, this.f34491a));
        if (!file.exists()) {
            xh1.f34998a.a(y1.a(this.f34491a), this.f34491a, new ss1(key, 2));
        }
        return new z10.a(file, key.c(), key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(r10 r10Var, String zipFile) {
        Intrinsics.checkNotNullParameter(zipFile, "zipFile");
        return kotlin.text.a0.z(zipFile, "images/" + r10Var.b(), true);
    }
}
