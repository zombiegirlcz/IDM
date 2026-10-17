package com.fourthline.orca.internal;

import com.fourthline.orca.internal.p70;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class m70 implements l70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31018b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f31019c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f31020a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public m70(File assetsFourthlineDirectory) {
        Intrinsics.checkNotNullParameter(assetsFourthlineDirectory, "assetsFourthlineDirectory");
        this.f31020a = assetsFourthlineDirectory;
    }

    @Override // com.fourthline.orca.internal.l70
    public p70 a(k70 key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        File file = new File(o70.a(key, this.f31020a));
        if (!file.exists()) {
            xh1.f34998a.a(y1.a(this.f31020a), this.f31020a, new mp1(key, 19));
        }
        return new p70.a(file, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(k70 k70Var, String zipFile) {
        Intrinsics.checkNotNullParameter(zipFile, "zipFile");
        return kotlin.text.a0.z(zipFile, "animations/" + k70Var.b(), true);
    }
}
