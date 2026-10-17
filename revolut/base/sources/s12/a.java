package s12;

import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements a12.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lx1.i f259038a;

    public a(lx1.i apmRecipientMapper) {
        Intrinsics.checkNotNullParameter(apmRecipientMapper, "apmRecipientMapper");
        this.f259038a = apmRecipientMapper;
    }

    public final List a(a12.c info) {
        Intrinsics.checkNotNullParameter(info, "info");
        if (info.f468a.isEmpty()) {
            return f0.f322471a;
        }
        List list = info.f468a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((fy1.q) this.f259038a).h((ApmContact) it8.next()));
        }
        return u.c(new ContactsWidgetDelegate.Model("ApmAreaContactsMapper_widget", arrayList, new TextLocalisedClause(R$string.apm_area_recents_title, null, null, 14), false, null, null, 56));
    }
}
