package cpi;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f107952b;

    public /* synthetic */ f(g gVar, int i) {
        this.f107951a = i;
        this.f107952b = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f107951a) {
            case 0:
                return (ip.b) this.f107952b.f107955c;
            default:
                return (Context) ((lm.c) this.f107952b.f107954b).invoke();
        }
    }
}
