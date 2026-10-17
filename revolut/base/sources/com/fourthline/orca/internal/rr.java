package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.kr;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class rr implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final or f32805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pe f32806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f32807c;
    private final kr d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DocumentType.values().length];
            try {
                iArr[DocumentType.FRENCH_ID_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DocumentType.ID_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public rr(or repository, pe dateFormatter, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f32805a = repository;
        this.f32806b = dateFormatter;
        this.f32807c = imageServiceLocator;
        c81.a aVar = c81.f27404a;
        this.d = new kr(c81.a.a(aVar, R.string.step_document_version_header, 0, 2, null), c81.a.a(aVar, R.string.step_document_version_label_version, 0, 2, null), c81.a.a(aVar, R.string.shared_button_continue, 0, 2, null), new c81.d(R.string.shared_button_back, R.string.shared_button_back_accessibility), zhm.f0.f322471a, false, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kr a(rr rrVar, fr frVar, kr krVar) {
        Intrinsics.checkNotNullParameter(krVar, "<this>");
        List<fr> listA = rrVar.f32805a.a();
        ArrayList arrayList = new ArrayList(zhm.w.t(listA, 10));
        Date dateC = null;
        for (fr frVar2 : listA) {
            DocumentType documentTypeC = frVar2.b().c();
            c81 c81VarA = rrVar.a(frVar2, dateC);
            r10 r10VarA = rrVar.a(frVar2);
            kr.a aVar = new kr.a(documentTypeC, c81VarA, r10VarA != null ? rrVar.f32807c.a(r10VarA) : null, frVar2.equals(frVar));
            dateC = frVar2.c();
            arrayList.add(aVar);
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj2 = arrayList.get(i);
                i++;
                if (((kr.a) obj2).d()) {
                    z = true;
                    break;
                }
            }
        }
        return kr.a(krVar, null, null, null, null, arrayList, z, 15, null);
    }

    public final Function1 b(fr frVar) {
        return new jn1(this, frVar, 18);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public kr getInitialState() {
        return this.d;
    }

    private final c81 a(fr frVar, Date date) {
        if (frVar.c() != null) {
            return c81.f27404a.a(R.string.step_document_version_radio_id_issued_after, this.f32806b.a(frVar.c()));
        }
        if (date == null) {
            return null;
        }
        return c81.f27404a.a(R.string.step_document_version_radio_id_issued_before, this.f32806b.a(date));
    }

    private final r10 a(fr frVar) {
        String strC = frVar.a().c();
        if (Intrinsics.f(strC, "FRA")) {
            int i = a.$EnumSwitchMapping$0[frVar.b().c().ordinal()];
            if (i == 1) {
                return r10.f32588p;
            }
            if (i != 2) {
                return null;
            }
            return r10.f32589q;
        }
        if (!Intrinsics.f(strC, "ROU")) {
            return null;
        }
        int i2 = a.$EnumSwitchMapping$0[frVar.b().c().ordinal()];
        if (i2 == 1) {
            return r10.f32590r;
        }
        if (i2 != 2) {
            return null;
        }
        return r10.f32592s;
    }
}
