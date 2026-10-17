package xy7;

import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xo8.j0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f309632b;

    public /* synthetic */ i(k kVar, int i) {
        this.f309631a = i;
        this.f309632b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f309631a) {
            case 0:
                zw7.a addressChangeData = (zw7.a) obj2;
                Intrinsics.checkNotNullParameter(addressChangeData, "addressChangeData");
                k kVar = this.f309632b;
                kVar.getClass();
                d0 list = efm.r.fromIterable(addressChangeData.f325753b).flatMapSingle(new j(0, new i(kVar, 1))).toList();
                Intrinsics.checkNotNullExpressionValue(list, "toList(...)");
                xx9.d dVar = new xx9.d(29, new xpe.c(kVar, addressChangeData, 27));
                list.getClass();
                ufm.i iVar = new ufm.i(list, dVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            default:
                zw7.b petItem = (zw7.b) obj2;
                Intrinsics.checkNotNullParameter(petItem, "petItem");
                d0 d0VarFirstOrError = m70.a.h(this.f309632b.f309636c.d(petItem.f325754a), new j0(petItem, 9), null, new xx9.e(17), 2).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                return d0VarFirstOrError.o(new b(null, petItem.f325756c, petItem.d, petItem.f325755b));
        }
    }
}
