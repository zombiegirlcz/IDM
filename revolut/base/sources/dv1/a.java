package dv1;

import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a extends q implements Function1 {
    public static final a f = new a();

    public a() {
        super(1, ApmDescriptor.Phone.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String p0 = (String) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new ApmDescriptor.Phone(p0);
    }
}
