package i2a;

import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import j2a.c;
import j2a.e;
import j2a.g;
import j2a.h;
import j2a.k;
import j2a.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final P2pPersonalisation a(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        if (hVar instanceof g) {
            g gVar = (g) hVar;
            String str = gVar.f170783a;
            n nVar = gVar.f170784b;
            String str2 = nVar.f170791a;
            String str3 = nVar.f170792b;
            String str4 = nVar.f170793c;
            String str5 = nVar.d;
            k kVar = nVar.e;
            return new P2pPersonalisation(str, new P2pPersonalisation.Content.Video(str2, str3, str4, str5, kVar != null ? new P2pPersonalisation.Font(kVar.f170787a, kVar.f170788b, kVar.f170789c) : null));
        }
        if (!(hVar instanceof e)) {
            throw new NoWhenBranchMatchedException();
        }
        e eVar = (e) hVar;
        String str6 = eVar.f170780a;
        c cVar = eVar.f170781b;
        String str7 = cVar.f170776a;
        String str8 = cVar.f170777b;
        String str9 = cVar.f170778c;
        k kVar2 = cVar.d;
        return new P2pPersonalisation(str6, new P2pPersonalisation.Content.Image(str7, str8, str9, kVar2 != null ? new P2pPersonalisation.Font(kVar2.f170787a, kVar2.f170788b, kVar2.f170789c) : null));
    }

    public static final ArrayList b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(a((h) it8.next()));
        }
        return arrayList;
    }

    public static final h c(P2pPersonalisation p2pPersonalisation) {
        Intrinsics.checkNotNullParameter(p2pPersonalisation, "<this>");
        P2pPersonalisation.Content content = p2pPersonalisation.f79970b;
        String str = p2pPersonalisation.f79969a;
        if (content instanceof P2pPersonalisation.Content.Video) {
            P2pPersonalisation.Content.Video video = (P2pPersonalisation.Content.Video) content;
            String str2 = video.f79974a;
            String str3 = video.f79975b;
            String str4 = video.f79976c;
            String str5 = video.d;
            P2pPersonalisation.Font font = video.e;
            return new g(str, new n(str2, str3, str4, str5, font != null ? new k(font.f79977a, font.f79978b, font.f79979c) : null));
        }
        if (!(content instanceof P2pPersonalisation.Content.Image)) {
            throw new NoWhenBranchMatchedException();
        }
        P2pPersonalisation.Content.Image image = (P2pPersonalisation.Content.Image) content;
        String str6 = image.f79971a;
        String str7 = image.f79972b;
        String str8 = image.f79973c;
        P2pPersonalisation.Font font2 = image.d;
        return new e(str, new c(str6, str7, str8, font2 != null ? new k(font2.f79977a, font2.f79978b, font2.f79979c) : null));
    }
}
