package fgl;

import android.content.Context;
import com.revolut.shared.feature.wealth.ui_kit.models.image.RoundedRectImage;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.c {
    public Context u;
    public RoundedRectImage v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f135100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f135101x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f135102y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f135101x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f135100w = obj2;
        this.f135102y |= Integer.MIN_VALUE;
        return this.f135101x.g(null, null, this);
    }
}
