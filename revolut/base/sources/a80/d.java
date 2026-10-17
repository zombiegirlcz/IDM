package a80;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1986b;

    public d(String title, String uri2, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(uri2, "uri");
                this.f1985a = title;
                this.f1986b = uri2;
                break;
            default:
                Intrinsics.checkNotNullParameter(title, "name");
                Intrinsics.checkNotNullParameter(uri2, "extension");
                this.f1985a = title;
                this.f1986b = uri2;
                break;
        }
    }

    public String a() {
        return this.f1986b;
    }

    public String b() {
        return this.f1985a;
    }
}
