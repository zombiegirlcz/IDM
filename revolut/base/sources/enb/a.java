package enb;

import ehe.n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f127787b;

    public /* synthetic */ a(g gVar, int i) {
        this.f127786a = i;
        this.f127787b = gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f127786a) {
            case 0:
                String key = (String) obj2;
                Long l2 = (Long) obj3;
                l2.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, this.f127787b.f127799c, key, l2);
                break;
            case 1:
                List forms = (List) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(forms, "forms");
                this.f127787b.f127798b.f("CACHE_KEY_TAX_FORMS", forms);
                break;
            default:
                List param = (List) obj2;
                List options = (List) obj3;
                Intrinsics.checkNotNullParameter(param, "param");
                Intrinsics.checkNotNullParameter(options, "options");
                n.z("CACHE_KEY_STATEMENT_OPTIONS", g.d(param), this.f127787b.f127798b, options);
                break;
        }
        return Unit.f186387a;
    }
}
