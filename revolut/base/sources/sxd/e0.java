package sxd;

import com.revolut.feature.standingordertopup.impl.ui.model.SuggestionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kxd.a f266422a;

    public e0(kxd.a standingOrderInteractor) {
        Intrinsics.checkNotNullParameter(standingOrderInteractor, "standingOrderInteractor");
        this.f266422a = standingOrderInteractor;
    }

    public static SuggestionItem b(int i, dj0.d dVar, List list) {
        Object next;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (!((SuggestionItem) obj2).f88197b) {
                arrayList.add(obj2);
            }
        }
        if (dVar != null) {
            Iterator it8 = list2.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((SuggestionItem) next).f88196a, dVar)) {
                    break;
                }
            }
            SuggestionItem suggestionItem = (SuggestionItem) next;
            if (suggestionItem != null) {
                return suggestionItem;
            }
        }
        SuggestionItem suggestionItem2 = (SuggestionItem) zhm.d0.e0(arrayList.size() - i, arrayList);
        return suggestionItem2 == null ? (SuggestionItem) zhm.d0.d0(arrayList) : suggestionItem2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6 A[LOOP:0: B:25:0x00e0->B:27:0x00e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(xi0.b r11, boolean r12, dj0.d r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sxd.e0.a(xi0.b, boolean, dj0.d, gim.c):java.io.Serializable");
    }
}
