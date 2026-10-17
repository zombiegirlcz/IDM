package y10;

import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import i20.q0;
import i20.r0;
import i20.s0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import v20.m2;
import v20.v0;
import y07.m;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f310272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a20.a f310273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f01.a f310274c;

    public l(v0 imageRepository, a20.a authHeadersProvider, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(imageRepository, "imageRepository");
        Intrinsics.checkNotNullParameter(authHeadersProvider, "authHeadersProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f310272a = imageRepository;
        this.f310273b = authHeadersProvider;
        this.f310274c = uiKitResources;
    }

    public static String a(q0.a.b bVar, r0 r0Var) {
        int i = k.f310271a[r0Var.ordinal()];
        if (i == 1) {
            kotlin.ranges.c cVarL = kotlin.ranges.f.l(bVar != null ? (int) (bVar.getValue() * 2) : 1, 0);
            m70.a.c(t0.f186434a);
            return d0.k0(cVarL, "", null, null, 0, new m(12), 30);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        IntRange intRangeO = kotlin.ranges.f.o(0, bVar != null ? (int) (bVar.getValue() * 16) : 0);
        m70.a.c(t0.f186434a);
        return d0.k0(intRangeO, "", null, null, 0, new m(13), 30);
    }

    public final String b(q0.b bVar) {
        if (bVar instanceof q0.a.c) {
            q0.a.c cVar = (q0.a.c) bVar;
            List content = cVar.getContent();
            String strA = a(cVar.getSpacing(), r0.VERTICAL_BOX);
            final int i = 0;
            return d0.k0(content, strA, null, null, 0, new Function1(this) { // from class: y10.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f310270b;

                {
                    this.f310270b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    q0.g it8 = (q0.g) obj2;
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            break;
                    }
                    return this.f310270b.c(it8);
                }
            }, 30);
        }
        if (bVar instanceof q0.a.C0904a) {
            q0.a.C0904a c0904a = (q0.a.C0904a) bVar;
            List content2 = c0904a.getContent();
            String strA2 = a(c0904a.getSpacing(), r0.HORIZONTAL_BOX);
            final int i2 = 1;
            return d0.k0(content2, strA2, null, null, 0, new Function1(this) { // from class: y10.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ l f310270b;

                {
                    this.f310270b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    q0.g it8 = (q0.g) obj2;
                    switch (i2) {
                        case 0:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            break;
                        default:
                            Intrinsics.checkNotNullParameter(it8, "it");
                            break;
                    }
                    return this.f310270b.c(it8);
                }
            }, 30);
        }
        if (!(bVar instanceof q0.c) && !(bVar instanceof q0.i) && !(bVar instanceof q0.f) && !(bVar instanceof q0.j) && !(bVar instanceof q0.h)) {
            throw new NoWhenBranchMatchedException();
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    public final String c(q0.g gVar) {
        if (gVar instanceof q0.a) {
            return b((q0.b) gVar);
        }
        String string = "";
        if (!(gVar instanceof q0.d)) {
            m70.a.c(t0.f186434a);
            return "";
        }
        q0.d dVar = (q0.d) gVar;
        if (dVar instanceof q0.d.h) {
            string = ((q0.d.h) dVar).getValue();
        } else if (dVar instanceof q0.d.e) {
            string = ((q0.d.e) dVar).getFilename();
        } else {
            boolean z = dVar instanceof q0.d.C0905d;
            f01.a aVar = this.f310274c;
            if (z) {
                string = aVar.b(new TimeClause(new DateTime(((q0.d.C0905d) dVar).getValue()).getMillis(), TimeClause.Format.DateFull.f57961b, null, null, 12)).toString();
            } else if (dVar instanceof q0.d.i) {
                string = aVar.b(new TimeClause(DateTime.parse(((q0.d.i) dVar).getValue(), DateTimeFormat.forPattern("HH:mm:ssZ")).getMillis(), TimeClause.Format.TimeDefault.f57977b, null, null, 12)).toString();
            } else if (dVar instanceof q0.d.g) {
                string = ((q0.d.g) dVar).getValue();
            } else if (dVar instanceof q0.d.f) {
                q0.d.f fVar = (q0.d.f) dVar;
                long amount = fVar.getAmount();
                xi0.a aVar2 = xi0.b.Companion;
                String currency = fVar.getCurrency();
                aVar2.getClass();
                string = aVar.b(new MoneyClause(new dj0.d(amount, xi0.a.a(currency)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)).toString();
            } else if (dVar instanceof q0.d.c) {
                string = aVar.b(new TimeClause(new DateTime(((q0.d.c) dVar).getValue()).getMillis(), TimeClause.Format.DateLong.f57962b, null, null, 12)).toString();
            } else if (dVar instanceof q0.d.a) {
                string = aVar.b(new TextLocalisedClause(((q0.d.a) dVar).getValue() ? R$string.chat_structure_yes : R$string.chat_structure_no, null, null, 14)).toString();
            } else {
                if (!(dVar instanceof q0.d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                m70.a.c(t0.f186434a);
            }
        }
        List<String> classes = dVar.getClasses();
        if (classes != null) {
            String strP = string;
            for (String str : classes) {
                if (Intrinsics.f(str, s0.ITALIC.a())) {
                    strP = p.a.p("<i>", strP, "</i>");
                } else if (Intrinsics.f(str, s0.BOLD.a())) {
                    strP = p.a.p("<b>", strP, "</b>");
                } else if (Intrinsics.f(str, s0.HEADING_1.a())) {
                    strP = p.a.p("<h3>", strP, "</h3>");
                } else if (Intrinsics.f(str, s0.HEADING_2.a())) {
                    strP = p.a.p("<h4>", strP, "</h4>");
                } else if (!Intrinsics.f(str, s0.HEADING_3.a()) && !Intrinsics.f(str, s0.NORMAL_TEXT.a())) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.b(rd0.c.DEBUG, "StructuredMessageMapper", p.a.p("No formatting for ", str, " class"), null, null, 16);
                }
            }
            if (strP != null) {
                return strP;
            }
        }
        return string;
    }

    public final ArrayList d(q0.g gVar) {
        ArrayList arrayList = new ArrayList();
        if (gVar instanceof q0.a.c) {
            Iterator it8 = ((q0.a.c) gVar).getContent().iterator();
            while (it8.hasNext()) {
                a0.x(d((q0.g) it8.next()), arrayList);
            }
        } else if (gVar instanceof q0.a.C0904a) {
            Iterator it9 = ((q0.a.C0904a) gVar).getContent().iterator();
            while (it9.hasNext()) {
                a0.x(d((q0.g) it9.next()), arrayList);
            }
        } else if (gVar instanceof q0.d.e) {
            q0.d.e eVar = (q0.d.e) gVar;
            UUID uuidFromString = UUID.fromString(eVar.getId());
            String strA = this.f310272a.a(uuidFromString);
            Intrinsics.h(uuidFromString);
            arrayList.add(new m2.a(eVar.getFilename(), strA != null ? this.f310273b.a(strA) : null, eVar.getMediaType(), uuidFromString, strA));
        }
        return arrayList;
    }
}
