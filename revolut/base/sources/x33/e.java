package x33;

import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class e {

    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f302638a = new a();

        private a() {
        }
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f302639a = new b();

        private b() {
        }
    }

    private e() {
    }

    public final List a() {
        if (!(this instanceof f)) {
            return f0.f322471a;
        }
        List list = ((f) this).f302640a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((PocketWithSubaccount) it8.next()).f65523a.f163145a);
        }
        return arrayList;
    }
}
