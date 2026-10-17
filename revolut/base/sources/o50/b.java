package o50;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import k50.p3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n30.n;
import org.jetbrains.annotations.NotNull;
import v20.n2;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f222305a;

    public b(n chatInteractor) {
        Intrinsics.checkNotNullParameter(chatInteractor, "chatInteractor");
        this.f222305a = chatInteractor;
    }

    public final Object a(List list, UUID uuid, String str, String str2, p3 p3Var) {
        if (str.equals("chat.action.missing-invitee-selected")) {
            List<v20.n> list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (v20.n nVar : list2) {
                    if ((nVar instanceof n2) && Intrinsics.f(((n2) nVar).getActionId(), "chat.action.missing-invitee-selected")) {
                        return Unit.f186387a;
                    }
                }
            }
        }
        Object objA = nim.a.a(this.f222305a.k(str, str2, uuid), p3Var);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }
}
