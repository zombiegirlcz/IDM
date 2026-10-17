package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.orca.internal.m21;
import com.google.android.exoplayer2.ExoPlayer;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class eo1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28213a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28215c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eo1(Context context, ExoPlayer exoPlayer, int i) {
        this.f28215c = context;
        this.d = exoPlayer;
        this.f28214b = i;
    }

    private final Object a(Object obj2) {
        return jf0.a((Context) this.f28215c, (ExoPlayer) this.d, this.f28214b, (Context) obj2);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f28213a) {
            case 0:
                return a(obj2);
            default:
                return m21.e.a((m21) this.f28215c, this.f28214b, (Pair) this.d, (c21) obj2);
        }
    }

    public /* synthetic */ eo1(m21 m21Var, int i, Pair pair) {
        this.f28215c = m21Var;
        this.f28214b = i;
        this.d = pair;
    }
}
