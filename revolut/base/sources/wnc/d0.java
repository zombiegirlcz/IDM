package wnc;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.models.robo.Template;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.jmrtd.lds.LDSFile;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298781a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f298782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Template f298783c;

    public /* synthetic */ d0(Data data, Template template) {
        this.f298782b = data;
        this.f298783c = template;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f298781a) {
            case 0:
                m mVar = (m) obj2;
                return m.a(mVar, null, null, null, null, null, null, r0.q(mVar.f298808g, new Pair(this.f298783c, this.f298782b)), 63);
            default:
                return m.a((m) obj2, null, this.f298782b, null, this.f298783c, null, null, null, LDSFile.EF_DG2_TAG);
        }
    }

    public /* synthetic */ d0(Template template, Data data) {
        this.f298783c = template;
        this.f298782b = data;
    }
}
