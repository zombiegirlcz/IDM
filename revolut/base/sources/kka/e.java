package kka;

import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public SkipShownArticleBehaviour.SkipIfWasShownWithinPeriod u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f184557w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f184558x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, Continuation continuation) {
        super(continuation);
        this.f184557w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f184558x |= Integer.MIN_VALUE;
        return this.f184557w.e(null, null, this);
    }
}
