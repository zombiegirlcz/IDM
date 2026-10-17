package zzd;

import com.revolut.feature.statements.api.navigation.DocumentsHubInitialConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 {
    public static String a(ArrayList tabs, String str, DocumentsHubInitialConfiguration initialConfiguration) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(initialConfiguration, "initialConfiguration");
        String str2 = null;
        if (tabs.isEmpty()) {
            return null;
        }
        if (str == null || tabs.isEmpty()) {
            str = null;
        } else {
            Iterator it8 = tabs.iterator();
            while (it8.hasNext()) {
                if (((wxd.u) it8.next()).f300888a.equals(str)) {
                    break;
                }
            }
            str = null;
        }
        if (str != null) {
            return str;
        }
        if (!Intrinsics.f(initialConfiguration, DocumentsHubInitialConfiguration.Default.f88256a)) {
            if (initialConfiguration instanceof DocumentsHubInitialConfiguration.Tab) {
                Iterator it9 = tabs.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it9.next();
                    if (((wxd.u) next2).f300888a.equalsIgnoreCase(((DocumentsHubInitialConfiguration.Tab) initialConfiguration).f88257a)) {
                        break;
                    }
                }
                wxd.u uVar = (wxd.u) next2;
                if (uVar != null) {
                    str2 = uVar.f300888a;
                }
            } else {
                if (!(initialConfiguration instanceof DocumentsHubInitialConfiguration.Custom)) {
                    throw new NoWhenBranchMatchedException();
                }
                Iterator it10 = tabs.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it10.next();
                    if (((wxd.u) next).f300890c instanceof wxd.v) {
                        break;
                    }
                }
                wxd.u uVar2 = (wxd.u) next;
                if (uVar2 != null) {
                    str2 = uVar2.f300888a;
                }
            }
        }
        return str2 == null ? ((wxd.u) zhm.d0.b0(tabs)).f300888a : str2;
    }
}
