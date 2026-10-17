package px8;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements dy8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f240583a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f240584b = a.DISABLED;

    private c() {
    }

    @Override // dy8.a
    public final String a() {
        switch (b.f240582a[f240584b.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "https://revolut.com/app/video-conference/complete";
            case 3:
                return "https://revolut.com/app/video-conference/cancel";
            case 4:
                return "https://revolut.com/app/video-conference/mismatch";
            case 5:
                return "https://revolut.com/app/video-conference/decline";
            case 6:
                return "https://revolut.com/app/video-conference/no-agent-available";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
