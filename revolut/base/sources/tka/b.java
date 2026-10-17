package tka;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import tk0.f;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements uk0.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f271925a;

    public b(ue0.c localStorage) {
        Intrinsics.checkNotNullParameter(localStorage, "localStorage");
        this.f271925a = localStorage;
    }

    @Override // uk0.b
    public final boolean a(mk0.a storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        int i = ska.a.f263781a;
        if (storage.h(new f("PRODUCT_ARTICLE_SHOWN_TIME")) == null) {
            Set setKeys = this.f271925a.keys();
            if (!(setKeys instanceof Collection) || !setKeys.isEmpty()) {
                Iterator it8 = setKeys.iterator();
                while (it8.hasNext()) {
                    if (a0.H((String) it8.next(), "PRODUCT_ARTICLE_SHOWN_KEY-", false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // uk0.b
    public final void b(mk0.a storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ue0.c cVar = this.f271925a;
        for (String str : cVar.keys()) {
            if (a0.H(str, "PRODUCT_ARTICLE_SHOWN_KEY-", false)) {
                Long l2 = (Long) j6.a.k(Long.TYPE, cVar, str);
                String strValueOf = l2 != null ? String.valueOf(l2.longValue()) : null;
                if (strValueOf != null) {
                    linkedHashMap.put(d0.e0(str, "PRODUCT_ARTICLE_SHOWN_KEY-"), strValueOf);
                }
            }
        }
        int i = ska.a.f263781a;
        storage.g(new f("PRODUCT_ARTICLE_SHOWN_TIME"), linkedHashMap);
    }
}
