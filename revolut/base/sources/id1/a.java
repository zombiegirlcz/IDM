package id1;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import efm.d0;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f160379b;

    public /* synthetic */ a(n nVar, int i) {
        this.f160378a = i;
        this.f160379b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f160378a) {
            case 0:
                final CatalogueCategory createdCategory = (CatalogueCategory) obj2;
                Intrinsics.checkNotNullParameter(createdCategory, "createdCategory");
                final int i = 1;
                Function1 function1 = new Function1() { // from class: id1.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        List it8 = (List) obj3;
                        switch (i) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                ListIterator listIterator = it8.listIterator();
                                while (listIterator.hasNext()) {
                                    Object next = listIterator.next();
                                    String str = ((CatalogueCategory) next).f60669a;
                                    CatalogueCategory catalogueCategory = createdCategory;
                                    if (Intrinsics.f(str, catalogueCategory.f60669a)) {
                                        next = catalogueCategory;
                                    }
                                    listIterator.set(next);
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(it8, "it");
                                CatalogueCategory catalogueCategory2 = createdCategory;
                                Intrinsics.h(catalogueCategory2);
                                it8.add(catalogueCategory2);
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                n nVar = this.f160379b;
                nVar.getClass();
                pfm.h hVar = new pfm.h(new d(nVar, function1, 1), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar.f(d0.m(createdCategory));
            case 1:
                zc1.f it8 = (zc1.f) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                hd1.a aVar = this.f160379b.f160403b;
                return hd1.a.c(it8);
            case 2:
                final CatalogueProduct updatedProduct = (CatalogueProduct) obj2;
                Intrinsics.checkNotNullParameter(updatedProduct, "updatedProduct");
                final int i2 = 0;
                Function1 function12 = new Function1() { // from class: id1.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        List it9 = (List) obj3;
                        switch (i2) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it9, "it");
                                ListIterator listIterator = it9.listIterator();
                                while (listIterator.hasNext()) {
                                    Object next = listIterator.next();
                                    String str = ((CatalogueProduct) next).f60683a;
                                    CatalogueProduct catalogueProduct = updatedProduct;
                                    if (Intrinsics.f(str, catalogueProduct.f60683a)) {
                                        next = catalogueProduct;
                                    }
                                    listIterator.set(next);
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(it9, "it");
                                CatalogueProduct catalogueProduct2 = updatedProduct;
                                Intrinsics.h(catalogueProduct2);
                                it9.add(catalogueProduct2);
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                n nVar2 = this.f160379b;
                nVar2.getClass();
                pfm.h hVar2 = new pfm.h(new d(nVar2, function12, 0), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
            case 3:
                zc1.b it9 = (zc1.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                hd1.a aVar2 = this.f160379b.f160403b;
                return hd1.a.b(it9);
            case 4:
                final CatalogueCategory updatedCategory = (CatalogueCategory) obj2;
                Intrinsics.checkNotNullParameter(updatedCategory, "updatedCategory");
                final int i3 = 0;
                Function1 function13 = new Function1() { // from class: id1.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        List it82 = (List) obj3;
                        switch (i3) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it82, "it");
                                ListIterator listIterator = it82.listIterator();
                                while (listIterator.hasNext()) {
                                    Object next = listIterator.next();
                                    String str = ((CatalogueCategory) next).f60669a;
                                    CatalogueCategory catalogueCategory = updatedCategory;
                                    if (Intrinsics.f(str, catalogueCategory.f60669a)) {
                                        next = catalogueCategory;
                                    }
                                    listIterator.set(next);
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(it82, "it");
                                CatalogueCategory catalogueCategory2 = updatedCategory;
                                Intrinsics.h(catalogueCategory2);
                                it82.add(catalogueCategory2);
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                n nVar3 = this.f160379b;
                nVar3.getClass();
                pfm.h hVar3 = new pfm.h(new d(nVar3, function13, 1), 2);
                Intrinsics.checkNotNullExpressionValue(hVar3, "fromAction(...)");
                return hVar3.f(d0.m(updatedCategory));
            case 5:
                zc1.f it10 = (zc1.f) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                hd1.a aVar3 = this.f160379b.f160403b;
                return hd1.a.c(it10);
            case 6:
                final CatalogueProduct createdProduct = (CatalogueProduct) obj2;
                Intrinsics.checkNotNullParameter(createdProduct, "createdProduct");
                final int i5 = 1;
                Function1 function14 = new Function1() { // from class: id1.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        List it92 = (List) obj3;
                        switch (i5) {
                            case 0:
                                Intrinsics.checkNotNullParameter(it92, "it");
                                ListIterator listIterator = it92.listIterator();
                                while (listIterator.hasNext()) {
                                    Object next = listIterator.next();
                                    String str = ((CatalogueProduct) next).f60683a;
                                    CatalogueProduct catalogueProduct = createdProduct;
                                    if (Intrinsics.f(str, catalogueProduct.f60683a)) {
                                        next = catalogueProduct;
                                    }
                                    listIterator.set(next);
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(it92, "it");
                                CatalogueProduct catalogueProduct2 = createdProduct;
                                Intrinsics.h(catalogueProduct2);
                                it92.add(catalogueProduct2);
                                break;
                        }
                        return Unit.f186387a;
                    }
                };
                n nVar4 = this.f160379b;
                nVar4.getClass();
                pfm.h hVar4 = new pfm.h(new d(nVar4, function14, 0), 2);
                Intrinsics.checkNotNullExpressionValue(hVar4, "fromAction(...)");
                return hVar4;
            case 7:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (cd1.f) this.f160379b.f160402a.get("TAX_RATES_SETTINGS_KEY");
            case 8:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) this.f160379b.f160402a.get("CATEGORIES_KEY");
            case 9:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) this.f160379b.f160402a.get("PRODUCTS_KEY");
            case 10:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (List) this.f160379b.f160402a.get("TAX_RATES_KEY");
            default:
                zc1.b it11 = (zc1.b) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                hd1.a aVar4 = this.f160379b.f160403b;
                return hd1.a.b(it11);
        }
    }
}
