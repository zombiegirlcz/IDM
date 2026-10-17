package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class xq {
    public static final List a(vq vqVar) {
        Intrinsics.checkNotNullParameter(vqVar, "<this>");
        ArrayList arrayList = new ArrayList();
        List listB = vqVar.b();
        if ((listB instanceof Collection) && listB.isEmpty()) {
            arrayList.add(DocumentType.PASSPORT);
        } else {
            Iterator it8 = listB.iterator();
            while (it8.hasNext()) {
                if (((di) it8.next()).c() == DocumentType.PASSPORT) {
                    break;
                }
            }
            arrayList.add(DocumentType.PASSPORT);
        }
        List<di> listB2 = vqVar.b();
        if ((listB2 instanceof Collection) && listB2.isEmpty()) {
            arrayList.add(DocumentType.ID_CARD);
        } else {
            for (di diVar : listB2) {
                if (diVar.c() == DocumentType.ID_CARD || diVar.c() == DocumentType.FRENCH_ID_CARD) {
                    break;
                }
            }
            arrayList.add(DocumentType.ID_CARD);
        }
        List<di> listB3 = vqVar.b();
        if ((listB3 instanceof Collection) && listB3.isEmpty()) {
            arrayList.add(DocumentType.DRIVERS_LICENSE);
        } else {
            for (di diVar2 : listB3) {
                if (diVar2.c() == DocumentType.DRIVERS_LICENSE || diVar2.c() == DocumentType.DUTCH_DRIVERS_LICENSE) {
                    break;
                }
            }
            arrayList.add(DocumentType.DRIVERS_LICENSE);
        }
        List listB4 = vqVar.b();
        if (!(listB4 instanceof Collection) || !listB4.isEmpty()) {
            Iterator it9 = listB4.iterator();
            while (it9.hasNext()) {
                if (((di) it9.next()).c() == DocumentType.RESIDENCE_PERMIT) {
                    return arrayList;
                }
            }
        }
        arrayList.add(DocumentType.RESIDENCE_PERMIT);
        return arrayList;
    }
}
