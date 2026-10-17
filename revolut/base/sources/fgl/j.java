package fgl;

import android.content.Context;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.n0;

/* JADX INFO: loaded from: classes12.dex */
public final class j extends gim.c {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ k E;
    public int F;
    public Context u;
    public Image v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n0 f135103w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f135104x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f135105y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.E = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return this.E.h(null, null, 0, this);
    }
}
