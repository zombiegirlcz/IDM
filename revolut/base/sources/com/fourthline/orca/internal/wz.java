package com.fourthline.orca.internal;

import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes23.dex */
public abstract class wz {

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f34819c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.f34819c = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj2, Continuation continuation) {
            return ((a) create(obj2, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            a aVar = new a(this.f34819c, continuation);
            aVar.f34818b = obj2;
            return aVar;
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object obj3 = this.f34818b;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f34817a;
            if (i == 0) {
                yhm.o.b(obj2);
                Function2 function2 = this.f34819c;
                this.f34818b = null;
                this.f34817a = 1;
                if (function2.invoke(obj3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }
    }

    public static final void a(boolean z, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }

    public static final String a(Enum r2) {
        Intrinsics.checkNotNullParameter(r2, "<this>");
        String strName = r2.name();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = strName.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final Object a(Flow flow, Function2 function2, Continuation continuation) {
        Object objCollect = flow.collect(new akg.m(wkm.s.f298328a, new a(function2, null), 5), continuation);
        if (objCollect != fim.a.COROUTINE_SUSPENDED) {
            objCollect = Unit.f186387a;
        }
        if (objCollect != fim.a.COROUTINE_SUSPENDED) {
            objCollect = Unit.f186387a;
        }
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }

    public static final Object a(String errorMessage, Function0 productionFallback) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(productionFallback, "productionFallback");
        return productionFallback.invoke();
    }

    public static final Void a(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        throw new IllegalStateException(("FL Developer error. " + errorMessage).toString());
    }
}
