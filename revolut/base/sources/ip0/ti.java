package ip0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class ti implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ui f166523b;

    public /* synthetic */ ti(ui uiVar, int i) {
        this.f166522a = i;
        this.f166523b = uiVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f166522a) {
            case 0:
                aw0.m9 it8 = (aw0.m9) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new wi(this.f166523b, it8.f10429a);
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return this.f166523b;
        }
    }
}
