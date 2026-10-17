package ji8;

import cli.j;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_onboarding.impl.R$string;
import java.util.ArrayList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f174388a;

    public h(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f174388a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EnumEntries<bj0.b> enumEntriesB = bj0.b.b();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesB, 10));
        for (bj0.b bVar : enumEntriesB) {
            arrayList.add(new SingleChoiceDelegate.Model(bVar.name(), w0.k(bVar), this.f174388a.f174385a == bVar, null, bVar, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, new lw0.a(new TextLocalisedClause(R$string.junior_signup_details_gender_placeholder, null, null, 14), new TextLocalisedClause(R$string.junior_signup_details_gender_hint, null, null, 14), null, null, false, 28));
    }
}
