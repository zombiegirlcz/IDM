package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RateEmojiDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b80 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163563a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f163565c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b80(RateEmojiDelegate rateEmojiDelegate, String str, int i) {
        this.f163565c = rateEmojiDelegate;
        this.d = str;
        this.f163564b = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f163563a) {
            case 0:
                ((RateEmojiDelegate) this.f163565c).f53143c.onNext(new u80((String) this.d, this.f163564b));
                break;
            default:
                in1.a aVar = (in1.a) this.f163565c;
                a90 a90Var = (a90) this.d;
                Integer numValueOf = Integer.valueOf(this.f163564b);
                koi.j jVar = a90Var.e;
                Intrinsics.i(jVar, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.RateNPSDelegate.Model");
                aVar.invoke(numValueOf, (y80) jVar);
                break;
        }
    }

    public /* synthetic */ b80(in1.a aVar, int i, a90 a90Var) {
        this.f163565c = aVar;
        this.f163564b = i;
        this.d = a90Var;
    }
}
