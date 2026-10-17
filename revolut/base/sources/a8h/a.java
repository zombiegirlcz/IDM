package a8h;

import a8h.b;
import c0h.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import nel.z;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final c0h.a a(b.a aVar) {
        c0h.b bVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        String id10 = aVar.getId();
        c0h.b[] bVarArrValues = c0h.b.values();
        int length = bVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i];
            if (a0.z(bVar.name(), id10, true)) {
                break;
            }
            i++;
        }
        if (bVar == null) {
            return null;
        }
        String name = aVar.getName();
        List<b.C0008b> instruments = aVar.getInstruments();
        ArrayList arrayList = new ArrayList(w.t(instruments, 10));
        for (b.C0008b c0008b : instruments) {
            z zVarA = tbl.a.a(c0008b.getInstrumentType());
            arrayList.add(new c(c0008b.getRef(), c0008b.getAnnualReturn(), zVarA, c0008b.getSymbol(), c0008b.getDescription(), c0008b.getTitle()));
        }
        return new c0h.a(bVar, name, arrayList);
    }
}
