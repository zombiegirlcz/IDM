package tse;

import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f274116b;

    public /* synthetic */ j(l lVar, int i) {
        this.f274115a = i;
        this.f274116b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Function0 it8 = (Function0) obj2;
        switch (this.f274115a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                List listA = this.f274116b.f274117a.a();
                yp0.b.k(listA, 0, 0, 0, 0, 31);
                return listA;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                List listA2 = this.f274116b.f274117a.a();
                int i = R$attr.uikit_dp0;
                yp0.b.k(listA2, 0, 0, i, i, 19);
                return listA2;
        }
    }
}
