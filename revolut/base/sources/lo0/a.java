package lo0;

import android.content.Context;
import android.content.res.Resources;
import aw0.e7;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit.models.TrackableClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CardDesignImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CardImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GifResourseImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f197326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Regex f197327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Regex f197328c;
    public final Set d;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f197326a = context;
        this.f197327b = new Regex("((?:_|^)?(ic|icn|icon|img|pic|uikit|\\d+|\\d+dp)(?:_|$))");
        this.f197328c = new Regex("[\\w.]+");
        String[] elements = {"accessibility", "accessibility_label", "action", "bar_button", "button", "cell", "collection", "common", "container", "controller", "header", "home", "main", "model", "new", ib.b.Screen, "screen_title", "section", "title"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.d = kotlin.collections.d.y0(elements);
    }

    public final String a(Clause clause, boolean z) {
        Clause f59924c;
        ResourceId f57782a;
        String strA;
        Intrinsics.checkNotNullParameter(clause, "clause");
        if (clause instanceof e7) {
            return c(((e7) clause).getF57782a(), z);
        }
        if (clause instanceof ImageClause) {
            ImageClause imageClause = (ImageClause) clause;
            Clause clause2 = imageClause.e;
            return (clause2 == null || (strA = a(clause2, z)) == null) ? d(imageClause.f57785a) : strA;
        }
        if (clause instanceof TrackableClause) {
            return c(((TrackableClause) clause).f57983a, z);
        }
        if (clause instanceof CompositeClause) {
            Iterator it8 = ((CompositeClause) clause).f57747a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    f57782a = null;
                    break;
                }
                Clause clause3 = (Clause) it8.next();
                f57782a = clause3 instanceof e7 ? ((e7) clause3).getF57782a() : null;
                if (f57782a != null) {
                    break;
                }
            }
            if (f57782a != null) {
                return c(f57782a, z);
            }
        } else if ((clause instanceof oy0.b) && (f59924c = ((oy0.b) clause).getF59924c()) != null) {
            return a(f59924c, z);
        }
        return null;
    }

    public final String b(Image image) {
        String strD;
        Intrinsics.checkNotNullParameter(image, "image");
        Clause f59924c = image.getF59924c();
        String strA = f59924c != null ? a(f59924c, true) : null;
        if (strA != null) {
            return strA;
        }
        if (image instanceof AnimatedResourceImage) {
            return d(((AnimatedResourceImage) image).f59838a);
        }
        if (image instanceof CardDesignImage) {
            return d(((CardDesignImage) image).f59858b);
        }
        if (image instanceof CardImage) {
            CardImage cardImage = (CardImage) image;
            Integer num = cardImage.f59866b;
            return (num == null || (strD = d(num.intValue())) == null) ? d(cardImage.f59865a) : strD;
        }
        if (image instanceof ConfigurableResourceImage) {
            return d(((ConfigurableResourceImage) image).f59882a);
        }
        if (image instanceof GifResourseImage) {
            return d(((GifResourseImage) image).f59922a);
        }
        if (image instanceof PairedImage) {
            PairedImage pairedImage = (PairedImage) image;
            String strB = b(pairedImage.f59968b);
            return strB == null ? b(pairedImage.f59967a) : strB;
        }
        if (image instanceof ResourceImage) {
            return d(((ResourceImage) image).f59995a);
        }
        return null;
    }

    public final String c(ResourceId res, boolean z) {
        String resourceEntryName;
        Intrinsics.checkNotNullParameter(res, "res");
        try {
            if (res instanceof ResourceId.IntResourceId) {
                resourceEntryName = this.f197326a.getResources().getResourceEntryName(((ResourceId.IntResourceId) res).f57934a);
            } else {
                if (!(res instanceof ResourceId.StringResourceId)) {
                    throw new NoWhenBranchMatchedException();
                }
                resourceEntryName = ((ResourceId.StringResourceId) res).f57935a;
            }
            Intrinsics.h(resourceEntryName);
            if (!this.f197328c.f(resourceEntryName)) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "AnalyticsResourceParser", "Invalid res " + res, null, h0Var);
                return null;
            }
            if (!z) {
                return resourceEntryName;
            }
            List listM0 = d0.m0(resourceEntryName, new char[]{CoreConstants.DOT}, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listM0) {
                if (!this.d.contains((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                return zhm.d0.k0(arrayList, ".", null, null, 0, null, 62);
            }
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "AnalyticsResourceParser", p.a.p("res ", resourceEntryName, " has no meaningful parts"), null, h0Var2);
            return null;
        } catch (Resources.NotFoundException unused) {
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "AnalyticsResourceParser", "Missing res " + res, null, h0Var3);
            return null;
        }
    }

    public final String d(int i) {
        try {
            String resourceEntryName = this.f197326a.getResources().getResourceEntryName(i);
            Intrinsics.h(resourceEntryName);
            if (this.f197328c.f(resourceEntryName)) {
                return this.f197327b.replace(resourceEntryName, "");
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "AnalyticsResourceParser", a0.d.n("Invalid res ", i), null, h0Var);
            return null;
        } catch (Resources.NotFoundException unused) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "AnalyticsResourceParser", a0.d.n("Missing res ", i), null, h0Var2);
            return null;
        }
    }
}
