package ieg;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xag.c f160736b;

    public /* synthetic */ t(xag.c cVar, int i) {
        this.f160735a = i;
        this.f160736b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data roomsList = (Data) obj2;
        switch (this.f160735a) {
            case 0:
                Intrinsics.checkNotNullParameter(roomsList, "roomsList");
                break;
            default:
                Intrinsics.checkNotNullParameter(roomsList, "roomsList");
                break;
        }
        return new Pair(roomsList, this.f160736b);
    }
}
