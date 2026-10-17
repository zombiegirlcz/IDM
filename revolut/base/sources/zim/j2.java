package zim;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;

/* JADX INFO: loaded from: classes14.dex */
public final class j2 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322652b;

    public /* synthetic */ j2(String str, int i) {
        this.f322651a = i;
        this.f322652b = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f322651a) {
            case 0:
                String str = StandardNames.COLLECTIONS_PACKAGE_FQ_NAME.asString() + CoreConstants.DOT;
                if (!kotlin.text.a0.H(this.f322652b, str, false)) {
                    str = null;
                }
                return str == null ? "" : str;
            default:
                String str2 = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.asString() + CoreConstants.DOT;
                if (!kotlin.text.a0.H(this.f322652b, str2, false)) {
                    str2 = null;
                }
                return str2 == null ? "" : str2;
        }
    }
}
