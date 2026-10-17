package com.fourthline.orca.internal;

import android.net.Uri;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class sd1 implements rd1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f32992b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f32993c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f32994a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public sd1(File fourthlineDirectory) {
        Intrinsics.checkNotNullParameter(fourthlineDirectory, "fourthlineDirectory");
        this.f32994a = fourthlineDirectory;
    }

    @Override // com.fourthline.orca.internal.rd1
    public Uri a(wf0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Uri uri2 = Uri.parse(td1.a(key, this.f32994a));
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
        return uri2;
    }
}
