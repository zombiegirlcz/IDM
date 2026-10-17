package l9i;

import i9i.b;
import i9i.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import m9i.a;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static i9i.a a(a.b bVar) {
        return new i9i.a(bVar.getUrl(), Integer.parseInt(bVar.getWidth()), Integer.parseInt(bVar.getHeight()));
    }

    public static ArrayList b(List list, b bVar) {
        b bVar2;
        c cVar;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            m9i.a aVar = (m9i.a) it8.next();
            a.C1154a images = aVar.getImages();
            try {
                bVar2 = bVar;
                try {
                    cVar = new c(aVar.getId(), a(images.getFixedWidth()), a(images.getFixedWidthSmallStill()), a(images.getDownsizedMedium()), bVar2);
                } catch (Exception e) {
                    e = e;
                    Exception exc2 = e;
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                    cVar = null;
                    d.a(rd0.c.ERROR, null, null, exc2, h0Var);
                }
            } catch (Exception e2) {
                e = e2;
                bVar2 = bVar;
            }
            if (cVar != null) {
                arrayList.add(cVar);
            }
            bVar = bVar2;
        }
        return arrayList;
    }
}
