package bm9;

import java.io.Closeable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.Job;
import vlm.h;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f16773b;

    public /* synthetic */ d(Ref$ObjectRef ref$ObjectRef, int i) {
        this.f16772a = i;
        this.f16773b = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16772a) {
            case 0:
                Job job2 = (Job) this.f16773b.f186409a;
                if (job2 != null) {
                    job2.f(null);
                }
                return Unit.f186387a;
            case 1:
                h.f((Closeable) this.f16773b.f186409a);
                return Unit.f186387a;
            default:
                Object obj2 = this.f16773b.f186409a;
                if (obj2 != null) {
                    return (String) obj2;
                }
                Intrinsics.r("codeVerifier");
                throw null;
        }
    }
}
