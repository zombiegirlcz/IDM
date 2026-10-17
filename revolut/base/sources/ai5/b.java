package ai5;

import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    @NotNull
    public static final a Companion = a.f5195a;

    d0 b(String str);

    Object c(NaviCommand naviCommand, Continuation continuation);

    Object d(String str, Continuation continuation);
}
