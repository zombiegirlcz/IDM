package rrc;

import com.revolut.data.model.Data;
import java.io.File;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f256765a = new f();

    public f() {
        super(1, Data.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Throwable;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return new Data((File) obj2, null, false, 6, null);
    }
}
