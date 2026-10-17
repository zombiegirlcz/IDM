package fq;

import android.content.Context;
import androidx.glance.GlanceId;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class h extends gim.c {
    public Context u;
    public GlanceId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f137149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.appwidget_core.a f137150x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f137151y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.appwidget_core.a aVar, Continuation continuation) {
        super(continuation);
        this.f137150x = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f137149w = obj2;
        this.f137151y |= Integer.MIN_VALUE;
        return this.f137150x.onDelete(null, null, this);
    }
}
