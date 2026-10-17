package com.fourthline.orca.internal;

import android.content.res.Resources;
import com.fourthline.orca.internal.cd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes23.dex */
public class dd implements cd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f27705b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f27706c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gz0 f27707a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public dd(gz0 resourcesManager) {
        Intrinsics.checkNotNullParameter(resourcesManager, "resourcesManager");
        this.f27707a = resourcesManager;
    }

    @Override // com.fourthline.orca.internal.cd
    public List a(String input, List items) {
        cd.a aVar;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(items, "items");
        String strA = ba.a(input);
        if (strA.length() < 1) {
            return zhm.f0.f322471a;
        }
        Resources[] elements = {this.f27707a.b(), a()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = new ArrayList();
        Iterator it8 = items.iterator();
        while (it8.hasNext()) {
            a01 a01Var = (a01) it8.next();
            Iterator it9 = ((ArrayList) listL).iterator();
            while (true) {
                if (!it9.hasNext()) {
                    aVar = null;
                    break;
                }
                MatchResult matchResultA = a(a((Resources) it9.next(), a01Var.getName()), strA);
                if (matchResultA != null) {
                    aVar = new cd.a(matchResultA.getRange(), a01Var);
                    break;
                }
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private final MatchResult a(String str, String str2) {
        return new Regex(str2, kotlin.text.q.IGNORE_CASE).b(str);
    }

    private final String a(Resources resources, c81 c81Var) {
        return ba.a(d81.a(c81Var, resources));
    }

    private final Resources a() {
        if (Intrinsics.f(this.f27707a.a().getLanguage(), "en")) {
            return null;
        }
        gz0 gz0Var = this.f27707a;
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        return gz0Var.b(ENGLISH);
    }
}
