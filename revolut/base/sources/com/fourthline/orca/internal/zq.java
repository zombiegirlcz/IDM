package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.sq;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class zq implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final om f35691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f35692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sq f35693c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[sq.b.values().length];
            try {
                iArr[sq.b.f33104c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sq.b.f33102a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sq.b.f33103b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zq(om documentOptionsComparator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(documentOptionsComparator, "documentOptionsComparator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f35691a = documentOptionsComparator;
        this.f35692b = imageServiceLocator;
        c81.a aVar = c81.f27404a;
        this.f35693c = new sq(c81.a.a(aVar, R.string.step_document_type_header, 0, 2, null), c81.a.a(aVar, R.string.step_document_type_label_type, 0, 2, null), c81.a.a(aVar, R.string.step_document_type_hint_instructions, 0, 2, null), c81.a.a(aVar, R.string.shared_button_continue, 0, 2, null), new c81.d(R.string.shared_button_back, R.string.shared_button_back_accessibility), zhm.f0.f322471a, false, new sq.c(c81.a.a(aVar, R.string.step_document_type_footer_document_not_accepted, 0, 2, null), c81.a.a(aVar, R.string.shared_button_exit, 0, 2, null)), 64, null);
    }

    public final Function1 a(List supportedDocuments, String issuingCountryIso3, DocumentType documentType) {
        Intrinsics.checkNotNullParameter(supportedDocuments, "supportedDocuments");
        Intrinsics.checkNotNullParameter(issuingCountryIso3, "issuingCountryIso3");
        return new vi1(this, supportedDocuments, issuingCountryIso3, documentType, 2);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public sq getInitialState() {
        return this.f35693c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sq a(zq zqVar, List list, String str, DocumentType documentType, sq sqVar) {
        boolean z;
        sq sqVar2;
        Intrinsics.checkNotNullParameter(sqVar, "<this>");
        List listD1 = zhm.d0.d1(zqVar.a(list, str));
        List listP = sqVar.p();
        if ((listP instanceof Collection) && listP.isEmpty()) {
            z = false;
        } else {
            Iterator it8 = listP.iterator();
            while (it8.hasNext()) {
                if (((sq.a) it8.next()).b() == sq.b.f33102a) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        sq sqVarA = sq.a(sqVar, null, null, null, null, null, listD1, z, null, 159, null);
        return (documentType == null || (sqVar2 = (sq) zqVar.a(documentType).invoke(sqVarA)) == null) ? sqVarA : sqVar2;
    }

    public final Function1 a(DocumentType documentType) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        return new ss1(documentType, 13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sq a(DocumentType documentType, sq sqVar) {
        Intrinsics.checkNotNullParameter(sqVar, "<this>");
        List<sq.a> listP = sqVar.p();
        ArrayList arrayList = new ArrayList(zhm.w.t(listP, 10));
        for (sq.a aVarA : listP) {
            int i = a.$EnumSwitchMapping$0[aVarA.b().ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aVarA = sq.a.a(aVarA, aVarA.d() == documentType ? sq.b.f33102a : sq.b.f33103b, null, null, null, 14, null);
            }
            arrayList.add(aVarA);
        }
        return sq.a(sqVar, null, null, null, null, null, arrayList, true, null, 159, null);
    }

    private final List a(List list, String str) {
        sq.b bVar;
        sq.b bVar2;
        sq.b bVar3;
        sq.b bVar4;
        sq.b bVar5;
        ArrayList arrayList = new ArrayList();
        DocumentType documentType = Intrinsics.f(str, "FRA") ? DocumentType.FRENCH_ID_CARD : DocumentType.ID_CARD;
        DocumentType documentType2 = Intrinsics.f(str, "NLD") ? DocumentType.DUTCH_DRIVERS_LICENSE : DocumentType.DRIVERS_LICENSE;
        c81.d dVarA = c81.a.a(c81.f27404a, R.string.step_document_type_document_type_Passport, 0, 2, null);
        z10 z10VarA = this.f35692b.a(r10.f32600x0);
        DocumentType documentType3 = DocumentType.PASSPORT;
        boolean z = list instanceof Collection;
        if (z && list.isEmpty()) {
            bVar = sq.b.f33104c;
        } else {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (((di) it8.next()).c() == DocumentType.PASSPORT) {
                    bVar = sq.b.f33103b;
                    break;
                }
            }
            bVar = sq.b.f33104c;
        }
        a(arrayList, bVar, dVarA, z10VarA, documentType3);
        c81.d dVarA2 = c81.a.a(c81.f27404a, R.string.step_document_type_document_type_NationalIDCard, 0, 2, null);
        z10 z10VarA2 = this.f35692b.a(r10.y0);
        if (z && list.isEmpty()) {
            bVar2 = sq.b.f33104c;
        } else {
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                di diVar = (di) it9.next();
                if (diVar.c() == DocumentType.ID_CARD || diVar.c() == DocumentType.FRENCH_ID_CARD) {
                    bVar2 = sq.b.f33103b;
                    break;
                }
            }
            bVar2 = sq.b.f33104c;
        }
        a(arrayList, bVar2, dVarA2, z10VarA2, documentType);
        c81.d dVarA3 = c81.a.a(c81.f27404a, R.string.step_document_type_document_type_DrivingLicense, 0, 2, null);
        z10 z10VarA3 = this.f35692b.a(r10.z0);
        if (z && list.isEmpty()) {
            bVar3 = sq.b.f33104c;
        } else {
            Iterator it10 = list.iterator();
            while (it10.hasNext()) {
                di diVar2 = (di) it10.next();
                if (diVar2.c() == DocumentType.DRIVERS_LICENSE || diVar2.c() == DocumentType.DUTCH_DRIVERS_LICENSE) {
                    bVar3 = sq.b.f33103b;
                    break;
                }
            }
            bVar3 = sq.b.f33104c;
        }
        a(arrayList, bVar3, dVarA3, z10VarA3, documentType2);
        c81.d dVarA4 = c81.a.a(c81.f27404a, R.string.step_document_type_document_type_ResidencePermit, 0, 2, null);
        z10 z10VarA4 = this.f35692b.a(r10.A0);
        DocumentType documentType4 = DocumentType.RESIDENCE_PERMIT;
        if (z && list.isEmpty()) {
            bVar4 = sq.b.f33104c;
        } else {
            Iterator it11 = list.iterator();
            while (it11.hasNext()) {
                if (((di) it11.next()).c() == DocumentType.RESIDENCE_PERMIT) {
                    bVar4 = sq.b.f33103b;
                    break;
                }
            }
            bVar4 = sq.b.f33104c;
        }
        a(arrayList, bVar4, dVarA4, z10VarA4, documentType4);
        if (Intrinsics.f(str, "ITA")) {
            c81.d dVarA5 = c81.a.a(c81.f27404a, R.string.step_document_type_document_type_PaperID, 0, 2, null);
            z10 z10VarA5 = this.f35692b.a(r10.B0);
            DocumentType documentType5 = DocumentType.PAPER_ID;
            if (!z || !list.isEmpty()) {
                Iterator it12 = list.iterator();
                while (it12.hasNext()) {
                    if (((di) it12.next()).c() == DocumentType.PAPER_ID) {
                        bVar5 = sq.b.f33103b;
                        break;
                    }
                }
                bVar5 = sq.b.f33104c;
                a(arrayList, bVar5, dVarA5, z10VarA5, documentType5);
            } else {
                bVar5 = sq.b.f33104c;
                a(arrayList, bVar5, dVarA5, z10VarA5, documentType5);
            }
        }
        zhm.z.w(arrayList, this.f35691a);
        return arrayList;
    }

    private final boolean a(List list, sq.b bVar, c81 c81Var, z10 z10Var, DocumentType documentType) {
        return list.add(new sq.a(bVar, c81Var, z10Var, documentType));
    }
}
