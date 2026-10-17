package xf;

import com.google.protobuf.c1;

/* JADX INFO: loaded from: classes17.dex */
public final class c0 implements c1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f304723b = new c0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f304724c = new c0(1);
    public static final c0 d = new c0(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304725a;

    public /* synthetic */ c0(int i) {
        this.f304725a = i;
    }

    @Override // com.google.protobuf.c1
    public final boolean isInRange(int i) {
        switch (this.f304725a) {
            case 0:
                if (d0.a(i) != null) {
                }
                break;
            case 1:
                if (e0.a(i) != null) {
                }
                break;
            default:
                if (x0.a(i) != null) {
                }
                break;
        }
        return false;
    }
}
