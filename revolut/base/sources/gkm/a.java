package gkm;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextContextualKt;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeCheckerState f144505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeSystemContext f144506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RigidTypeMarker f144507c;
    public final RigidTypeMarker d;

    public a(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        this.f144505a = typeCheckerState;
        this.f144506b = typeSystemContext;
        this.f144507c = rigidTypeMarker;
        this.d = rigidTypeMarker2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractTypeChecker abstractTypeChecker = AbstractTypeChecker.INSTANCE;
        TypeSystemContext typeSystemContext = this.f144506b;
        return Boolean.valueOf(abstractTypeChecker.isSubtypeForSameConstructor(this.f144505a, typeSystemContext, TypeSystemContextContextualKt.asArgumentList(typeSystemContext, this.f144507c), this.d));
    }
}
