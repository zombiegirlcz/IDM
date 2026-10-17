package p01;

import android.text.SpannableStringBuilder;

/* JADX INFO: loaded from: classes20.dex */
public final class y extends gim.c {
    public SpannableStringBuilder u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f231462w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f231463x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, gim.c cVar) {
        super(cVar);
        this.f231462w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f231463x |= Integer.MIN_VALUE;
        return this.f231462w.a(this);
    }
}
