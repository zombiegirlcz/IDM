package mp6;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.data.model.Data;
import com.revolut.feature.feedback.api.domain.FeedbackTag;
import ip0.u80;
import ip0.y;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mhd.p0;
import yhm.m;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f207744w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, Continuation continuation, n nVar) {
        super(2, continuation);
        this.u = i;
        this.f207744w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(0, continuation, this.f207744w);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(1, continuation, this.f207744w);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(2, continuation, this.f207744w);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((u80) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        boolean z;
        int i = this.u;
        int i2 = 1;
        n nVar = this.f207744w;
        switch (i) {
            case 0:
                u80 clickData = (u80) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Intrinsics.h(clickData);
                cji.d dVar = nVar.v;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                String str = clickData.f166631a;
                int i3 = clickData.f166632b;
                if (str.equals("RATE_ITEM_LIST_ID")) {
                    if (((yo6.e) dVar.a()).c() != i3) {
                        cji.d dVar2 = nVar.f207767x;
                        dVar2.d(h0.f322473a);
                    }
                    for (yo6.e eVar : yo6.e.a()) {
                        if (eVar.c() == i3) {
                            dVar.d(eVar);
                            nVar.f3(true);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                return Unit.f186387a;
            case 1:
                y clickData2 = (y) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str2 = clickData2.f167225a;
                ActionsView.Item item = clickData2.f167226b;
                Object[] objArr = 0;
                if (Intrinsics.f(str2, "FEEDBACK_EXTENSION_ACTIONS_LIST_ID")) {
                    cji.d dVar3 = nVar.f207767x;
                    Object obj3 = item.f58324n;
                    FeedbackTag feedbackTag = obj3 instanceof FeedbackTag ? (FeedbackTag) obj3 : null;
                    if (feedbackTag != null) {
                        boolean zContains = ((Set) dVar3.a()).contains(feedbackTag);
                        Set setH1 = d0.h1((Set) dVar3.a());
                        if (zContains) {
                            setH1.remove(feedbackTag);
                        } else {
                            setH1.add(feedbackTag);
                        }
                        dVar3.d(setH1);
                    }
                } else if (Intrinsics.f(str2, "FAQ_FEEDBACK_ITEM_ID")) {
                    Intrinsics.checkNotNullParameter(clickData2, "clickData");
                    try {
                        m.Companion companion = yhm.m.INSTANCE;
                        String str3 = item.f58316a;
                        if (Intrinsics.f(str3, "FAQ_FEEDBACK_LIKE_ITEM_ID")) {
                            z = true;
                        } else {
                            if (!Intrinsics.f(str3, "FAQ_FEEDBACK_DISLIKE_ITEM_ID")) {
                                throw new IllegalArgumentException("Unknown feedback list id: " + item.f58316a);
                            }
                            z = false;
                        }
                        objA = Boolean.valueOf(z);
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = yhm.m.INSTANCE;
                        objA = yhm.o.a(th10);
                    }
                    Throwable thA = yhm.m.a(objA);
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                    if (objA instanceof yhm.n) {
                        objA = null;
                    }
                    Boolean bool = (Boolean) objA;
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        switch (c.f207742a[((ep6.d) nVar.u.a()).f128085b.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 5:
                                nVar.i3(zBooleanValue);
                                break;
                            case 4:
                                nVar.T2(new p0(nVar, new k(nVar, zBooleanValue, objArr == true ? 1 : 0, i2), (Continuation) null), new yi5.b(27));
                                break;
                            case 6:
                            case 7:
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return Unit.f186387a;
            default:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                nVar.f207766w.d(data);
                return Unit.f186387a;
        }
    }
}
