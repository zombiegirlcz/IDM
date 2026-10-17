package lsh;

import com.revolut.feature.widgets.api.navigation.carousel.WidgetCarouselFlowProvider$InputData;
import gim.c;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends c {
    public WidgetCarouselFlowProvider$InputData u;
    public ish.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f199681w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f199682x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f199683y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f199682x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f199681w = obj2;
        this.f199683y |= Integer.MIN_VALUE;
        return this.f199682x.a(null, this);
    }
}
