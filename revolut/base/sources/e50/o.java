package e50;

import com.revolut.chat.ui.inbox.InboxScreenContract$DomainState;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.feature.in_app_calls.InAppCallStateWithData;
import com.revolut.feature.tickets.api.extensions.TicketsWidgetContract$State;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import v30.c0;
import v30.y;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122689a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f122690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InboxScreenContract$DomainState f122691c;

    public /* synthetic */ o(InboxScreenContract$DomainState inboxScreenContract$DomainState, q qVar) {
        this.f122691c = inboxScreenContract$DomainState;
        this.f122690b = qVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f122689a) {
            case 0:
                List<y> feeds = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(feeds, "feeds");
                InboxScreenContract$DomainState inboxScreenContract$DomainState = this.f122691c;
                v30.s sVar = (v30.s) inboxScreenContract$DomainState.f51169c.getContent();
                if (sVar == null) {
                    sVar = v30.s.NONE;
                }
                q qVar = this.f122690b;
                boolean zD = ((rf3.d) qVar.f122694c).d();
                ArrayList arrayList = new ArrayList();
                for (y yVar : feeds) {
                    InAppCallStateWithData inAppCallStateWithData = null;
                    wh whVarG = null;
                    inAppCallStateWithData = null;
                    inAppCallStateWithData = null;
                    if (yVar.f285834b != c0.ASSISTANT || zD) {
                        v30.j jVar = yVar.f285835c;
                        UUID uuid = jVar != null ? jVar.f285785a : null;
                        InAppCallStateWithData inAppCallStateWithData2 = inboxScreenContract$DomainState.d;
                        if (inAppCallStateWithData2 != null && uuid != null && Intrinsics.f(inAppCallStateWithData2.f74786b, uuid)) {
                            inAppCallStateWithData = inAppCallStateWithData2;
                        }
                        whVarG = qVar.f122693b.g(yVar, inAppCallStateWithData, sVar);
                    }
                    if (whVarG != null) {
                        arrayList.add(whVarG);
                    }
                }
                return arrayList;
            default:
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter((TicketsWidgetContract$State) obj2, "<unused var>");
                return this.f122690b.f122692a.a(this.f122691c.f51167a);
        }
    }

    public /* synthetic */ o(q qVar, InboxScreenContract$DomainState inboxScreenContract$DomainState) {
        this.f122690b = qVar;
        this.f122691c = inboxScreenContract$DomainState;
    }
}
