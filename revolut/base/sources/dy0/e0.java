package dy0;

import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f120971b;

    public /* synthetic */ e0(long j2, int i) {
        this.f120970a = i;
        this.f120971b = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f120970a) {
            case 0:
                return Long.valueOf(this.f120971b);
            default:
                return IntOffset.m3328boximpl(this.f120971b);
        }
    }
}
