package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModel;
import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.e40;
import com.fourthline.orca.internal.fp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class jl implements e40.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f29942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dj f29943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gj f29944c;

    public jl(List countries, dj flowConfig, gj dataBundle) {
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        this.f29942a = countries;
        this.f29943b = flowConfig;
        this.f29944c = dataBundle;
    }

    private final void b(e40 e40Var) {
        e40Var.d().b(e40Var.a().b());
    }

    private final void c(e40 e40Var) {
        Object obj2;
        Object next;
        Iterator it8 = this.f29943b.getSupportedDocuments().iterator();
        loop0: while (true) {
            obj2 = null;
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            List<CountryNetworkModel.Document> idDocuments = ((CountryNetworkModel) next).getIdDocuments();
            if (!(idDocuments instanceof Collection) || !idDocuments.isEmpty()) {
                Iterator<T> it9 = idDocuments.iterator();
                while (it9.hasNext()) {
                    if (((CountryNetworkModel.Document) it9.next()).getType() == DocumentType.ID_CARD) {
                        break loop0;
                    }
                }
            }
        }
        CountryNetworkModel countryNetworkModel = (CountryNetworkModel) next;
        if (countryNetworkModel == null) {
            b(e40Var);
            return;
        }
        for (fd fdVar : this.f29942a) {
            if (Intrinsics.f(fdVar.c(), countryNetworkModel.getIssuingCountry())) {
                this.f29944c.a(fdVar);
                gj gjVar = this.f29944c;
                Iterator it10 = di.e.a(fdVar, this.f29943b.getSupportedDocuments()).iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        break;
                    }
                    Object next2 = it10.next();
                    if (((di) next2).c() == DocumentType.ID_CARD) {
                        obj2 = next2;
                        break;
                    }
                }
                gjVar.a((di) obj2);
                e40Var.d().b(new y30(new fp.c(new qo(this.f29943b.getDocumentStrategy(), this.f29943b.getTiltedStepsEnabled(), this.f29943b.getConfirmation(), this.f29943b.getImageCapture(), this.f29943b.getVideo(), this.f29943b.getIb.b.Analysis java.lang.String(), this.f29943b.getNfc(), this.f29943b.getSupportedDocuments(), this.f29943b.getCameraX().getEnabled(), this.f29943b.getNfcX().getEnabled()))));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // com.fourthline.orca.internal.e40.c
    public void a(e40 e40Var) {
        Intrinsics.checkNotNullParameter(e40Var, "<this>");
        if (this.f29943b.getDocumentStrategy().a(wk.f34723a.e())) {
            c(e40Var);
        } else {
            b(e40Var);
        }
    }
}
