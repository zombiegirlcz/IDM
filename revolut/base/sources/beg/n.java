package beg;

import com.revolut.data.model.Data;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f14840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xag.c f14841c;

    public /* synthetic */ n(Data data, xag.c cVar, int i) {
        this.f14839a = i;
        this.f14840b = data;
        this.f14841c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f14839a) {
            case 0:
                xag.c filters = this.f14841c;
                Intrinsics.h(filters);
                Data hotelsProperty = ((feg.e) obj2).f134608a;
                Intrinsics.checkNotNullParameter(hotelsProperty, "hotelsProperty");
                Data roomsListMap = this.f14840b;
                Intrinsics.checkNotNullParameter(roomsListMap, "roomsListMap");
                Intrinsics.checkNotNullParameter(filters, "filters");
                return new feg.e(hotelsProperty, roomsListMap, filters);
            default:
                return ieg.m.a((ieg.m) obj2, null, this.f14840b, null, this.f14841c, 5);
        }
    }
}
