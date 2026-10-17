package cie;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q extends kotlin.jvm.internal.a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f24513a = new q();

    public q() {
        super(2, rd0.e.class, "e", "e(Ljava/lang/Throwable;Ljava/util/Set;)V", 5);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, (Throwable) obj2, h0Var);
        return Unit.f186387a;
    }
}
