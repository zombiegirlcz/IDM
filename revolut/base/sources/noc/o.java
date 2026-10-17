package noc;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.models.robo.Template;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nn3.z;

/* JADX INFO: loaded from: classes6.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yoc.a f217990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final spc.h f217991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f217992c;

    public o(yoc.a allocationMapper, spc.h rebalanceStatusMapper, n headerBuilder) {
        Intrinsics.checkNotNullParameter(allocationMapper, "allocationMapper");
        Intrinsics.checkNotNullParameter(rebalanceStatusMapper, "rebalanceStatusMapper");
        Intrinsics.checkNotNullParameter(headerBuilder, "headerBuilder");
        this.f217990a = allocationMapper;
        this.f217991b = rebalanceStatusMapper;
        this.f217992c = headerBuilder;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList.add(nb0.b(pb0.Companion, a0.d.n("portfolio-allocation-loading-", i), false, 0, false, 30));
        }
        return yp0.b.g(arrayList, new ListSubheaderDelegate.Model("portfolio-allocation-header-listId", (Image) null, (Clause) this.f217992c.f217989a, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    public final List b(Data data, d config) {
        Intrinsics.checkNotNullParameter(config, "config");
        Data data2 = null;
        if (data != null) {
            try {
                Object content = data.getContent();
                data2 = new Data(content != null ? new w((Template) content) : null, data.getError(), data.getLoading());
            } catch (Throwable th10) {
                data2 = new Data(null, th10, data.getLoading());
            }
        }
        return c(data2, config);
    }

    public final List c(Data data, d config) {
        List list;
        Intrinsics.checkNotNullParameter(config, "config");
        return (data == null || (list = (List) iii.c.f(data, new z(this, 20), new nmb.v(12), new lk7.p(this, 6, config, data))) == null) ? a() : list;
    }
}
