package aa0;

import com.revolut.feature.backend_flow.domain.models.FormScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ad0.a f2738a;

    public q(ad0.a actionsMapper) {
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        this.f2738a = actionsMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[LOOP:0: B:23:0x007a->B:25:0x0080, LOOP_END] */
    @Override // aa0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.backend_flow.domain.models.InputItem a(com.revolut.feature.backend_flow.domain.models.InputItem r7, java.lang.Object r8) {
        /*
            r6 = this;
            com.revolut.feature.backend_flow.domain.models.EditableListItem r7 = (com.revolut.feature.backend_flow.domain.models.EditableListItem) r7
            aa0.r r8 = (aa0.r) r8
            java.lang.String r0 = "targetItem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "updatedValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            if (r8 == 0) goto Lb2
            java.lang.String r8 = r8.f2740a
            com.revolut.feature.backend_flow.domain.models.EditableListItem$EditableOptionsValue r0 = r7.f63404h
            if (r0 == 0) goto L19
            java.util.ArrayList r1 = r0.f63410a
            goto L1b
        L19:
            zhm.f0 r1 = zhm.f0.f322471a
        L1b:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            r3 = 0
            r4 = 10
            if (r2 == 0) goto L2e
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2e
            goto L6d
        L2e:
            java.util.Iterator r2 = r1.iterator()
        L32:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r2.next()
            com.revolut.feature.backend_flow.domain.models.EditableListItem$EditableOptionsValue$EditableOptionValue r5 = (com.revolut.feature.backend_flow.domain.models.EditableListItem.EditableOptionsValue.EditableOptionValue) r5
            java.lang.String r5 = r5.f63411a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r8)
            if (r5 == 0) goto L32
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = zhm.w.t(r1, r4)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L53:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L99
            java.lang.Object r4 = r1.next()
            com.revolut.feature.backend_flow.domain.models.EditableListItem$EditableOptionsValue$EditableOptionValue r4 = (com.revolut.feature.backend_flow.domain.models.EditableListItem.EditableOptionsValue.EditableOptionValue) r4
            java.lang.String r5 = r4.f63411a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r8)
            com.revolut.feature.backend_flow.domain.models.EditableListItem$EditableOptionsValue$EditableOptionValue r4 = com.revolut.feature.backend_flow.domain.models.EditableListItem.EditableOptionsValue.EditableOptionValue.a(r4, r5)
            r2.add(r4)
            goto L53
        L6d:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = zhm.w.t(r1, r4)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L7a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L8f
            java.lang.Object r4 = r1.next()
            com.revolut.feature.backend_flow.domain.models.EditableListItem$EditableOptionsValue$EditableOptionValue r4 = (com.revolut.feature.backend_flow.domain.models.EditableListItem.EditableOptionsValue.EditableOptionValue) r4
            r5 = 0
            com.revolut.feature.backend_flow.domain.models.EditableListItem$EditableOptionsValue$EditableOptionValue r4 = com.revolut.feature.backend_flow.domain.models.EditableListItem.EditableOptionsValue.EditableOptionValue.a(r4, r5)
            r2.add(r4)
            goto L7a
        L8f:
            com.revolut.feature.backend_flow.domain.models.EditableListItem$EditableOptionsValue$EditableOptionValue r1 = new com.revolut.feature.backend_flow.domain.models.EditableListItem$EditableOptionsValue$EditableOptionValue
            r4 = 1
            r1.<init>(r8, r3, r4)
            java.util.ArrayList r2 = zhm.d0.F0(r1, r2)
        L99:
            if (r0 == 0) goto La6
            java.lang.String r8 = "items"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r8)
            com.revolut.feature.backend_flow.domain.models.EditableListItem$EditableOptionsValue r8 = new com.revolut.feature.backend_flow.domain.models.EditableListItem$EditableOptionsValue
            r8.<init>(r2)
            goto Lab
        La6:
            com.revolut.feature.backend_flow.domain.models.EditableListItem$EditableOptionsValue r8 = new com.revolut.feature.backend_flow.domain.models.EditableListItem$EditableOptionsValue
            r8.<init>(r2)
        Lab:
            r0 = 383(0x17f, float:5.37E-43)
            com.revolut.feature.backend_flow.domain.models.EditableListItem r7 = com.revolut.feature.backend_flow.domain.models.EditableListItem.d(r7, r3, r8, r0)
            return r7
        Lb2:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: aa0.q.a(com.revolut.feature.backend_flow.domain.models.InputItem, java.lang.Object):com.revolut.feature.backend_flow.domain.models.InputItem");
    }

    @Override // aa0.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final FormScreen c(FormScreen screen, String id10, r value) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        return (FormScreen) this.f2738a.j(super.c(screen, id10, value), null);
    }
}
