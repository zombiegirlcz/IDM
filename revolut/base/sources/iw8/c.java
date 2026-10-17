package iw8;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements dy8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f168987a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f168988b = a.DISABLED;

    private c() {
    }

    @Override // dy8.a
    public final String a() {
        int i = b.f168986a[f168988b.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i == 2) {
            return "https://revolut.com/app/video-conference/completed";
        }
        throw new NoWhenBranchMatchedException();
    }
}
