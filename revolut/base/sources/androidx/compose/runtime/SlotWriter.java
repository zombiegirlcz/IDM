package androidx.compose.runtime;

import androidx.collection.IntSetKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.Composer;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.p;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 Ø\u00012\u00020\u0001:\u0002Ø\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\nJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\nJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\nJ\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\nJ\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u000fJ\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0019\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\fJ\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u0004\u0018\u00010\u00012\b\u0010$\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\u001f¢\u0006\u0004\b.\u0010#J\u0017\u0010/\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b/\u0010-J\u001f\u0010/\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b/\u0010(J\u0017\u00100\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b0\u0010-J\u001d\u00101\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J)\u00100\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b0\u00103J\u0017\u00105\u001a\u0004\u0018\u00010\u00012\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u0010\u000fJ\u000f\u00106\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b8\u00109J\u001f\u00108\u001a\u0004\u0018\u00010\u00012\u0006\u0010:\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b8\u0010;J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0000¢\u0006\u0004\b<\u0010\fJ\u0017\u0010?\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0000¢\u0006\u0004\b>\u0010\fJ\u0015\u0010@\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b@\u0010\fJ\u0015\u0010B\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020\u0006¢\u0006\u0004\bB\u0010+J\u0015\u0010C\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020\u001f¢\u0006\u0004\bE\u0010#J\r\u0010F\u001a\u00020\u001f¢\u0006\u0004\bF\u0010#J\r\u0010G\u001a\u00020\u001f¢\u0006\u0004\bG\u0010#J\r\u0010H\u001a\u00020\u001f¢\u0006\u0004\bH\u0010#J\u001f\u0010H\u001a\u00020\u001f2\u0006\u0010I\u001a\u00020\u00062\b\u0010J\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bH\u0010KJ\u001f\u0010M\u001a\u00020\u001f2\u0006\u0010I\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bM\u0010KJ)\u0010O\u001a\u00020\u001f2\u0006\u0010I\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010\u00012\b\u0010N\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bO\u0010PJ\r\u0010Q\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010RJ\u0015\u0010S\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\bS\u0010+J\u0015\u0010S\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\bS\u0010DJ\r\u0010T\u001a\u00020\u0006¢\u0006\u0004\bT\u0010RJ\r\u0010U\u001a\u00020\b¢\u0006\u0004\bU\u0010VJ1\u0010Y\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00062\u001a\u0010X\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u001f0W¢\u0006\u0004\bY\u0010ZJ\u0015\u0010\\\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020\u0006¢\u0006\u0004\b\\\u0010+J-\u0010_\u001a\b\u0012\u0004\u0012\u00020\u001a0^2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010]\u001a\u00020\b¢\u0006\u0004\b_\u0010`J+\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001a0^2\u0006\u0010[\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\ba\u0010bJ\u0017\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010cJ\u0017\u0010d\u001a\u00020\u001f2\b\b\u0002\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\bd\u0010+J\u0015\u0010e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u0019\u0010m\u001a\u0004\u0018\u00010j2\u0006\u0010\u0016\u001a\u00020\u0006H\u0000¢\u0006\u0004\bk\u0010lJ\u0019\u0010o\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0016\u001a\u00020\u0006H\u0000¢\u0006\u0004\bn\u0010cJ\u001b\u0010p\u001a\u0004\u0018\u00010\u00012\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bp\u0010&J3\u0010H\u001a\u00020\u001f2\u0006\u0010I\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010N\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bH\u0010qJ\u001f\u0010r\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\br\u00102J\u0017\u0010s\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\bs\u0010\nJ\u0017\u0010t\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\bt\u0010\nJ\u000f\u0010u\u001a\u00020\u001fH\u0002¢\u0006\u0004\bu\u0010#J\u0017\u0010v\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\bv\u0010+J\u001f\u0010z\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u00100\u001a\u00020wH\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b{\u0010\nJ\u000f\u0010|\u001a\u00020\u001fH\u0002¢\u0006\u0004\b|\u0010#J\u000f\u0010}\u001a\u00020\u0006H\u0002¢\u0006\u0004\b}\u0010RJ(\u0010\u007f\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u00062\u0006\u0010~\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0081\u0001\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0081\u0001\u0010+J\"\u0010\u0082\u0001\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0005\b\u0084\u0001\u0010#J\u001a\u0010\u0086\u0001\u001a\u00020\u001f2\u0007\u0010\u0085\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0086\u0001\u0010+J#\u0010\u0087\u0001\u001a\u00020\u001f2\u0007\u0010\u0085\u0001\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0083\u0001J#\u0010\u008a\u0001\u001a\u00020\b2\u0007\u0010\u0088\u0001\u001a\u00020\u00062\u0007\u0010\u0089\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u008a\u0001\u0010\u0018J,\u0010\u008b\u0001\u001a\u00020\u001f2\u0007\u0010\u0088\u0001\u001a\u00020\u00062\u0007\u0010\u0089\u0001\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u0080\u0001J#\u0010\u008c\u0001\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0005\b\u008c\u0001\u0010KJ$\u0010\u008f\u0001\u001a\u00020\u001f2\u0007\u0010\u008d\u0001\u001a\u00020\u00062\u0007\u0010\u008e\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0083\u0001JO\u0010\u0094\u0001\u001a\u00020\b2\u0007\u0010\u0090\u0001\u001a\u00020\u00062\u0007\u0010\u0085\u0001\u001a\u00020\u00062)\u0010\u0093\u0001\u001a$\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020j\u0018\u00010\u0091\u0001j\u0011\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020j\u0018\u0001`\u0092\u0001H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J-\u0010\u0098\u0001\u001a\u00020\u001f2\u0007\u0010\u0096\u0001\u001a\u00020\u00062\u0007\u0010\u0097\u0001\u001a\u00020\u00062\u0007\u0010\u0085\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0080\u0001J\u0019\u0010\u0099\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u0099\u0001\u0010\fJ\u001a\u0010\u009b\u0001\u001a\u00020\u00062\u0007\u0010\u009a\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u009b\u0001\u0010\fJ\u001d\u0010\u001d\u001a\u00020\u0006*\u00030\u009c\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u001d\u0010\u009d\u0001J\u0019\u0010\u009a\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0005\b\u009a\u0001\u0010\fJ \u0010\u009a\u0001\u001a\u00020\u0006*\u00030\u009c\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009d\u0001J\u001e\u00104\u001a\u00020\u0006*\u00030\u009c\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b4\u0010\u009d\u0001J)\u0010\u009f\u0001\u001a\u00020\u001f*\u00030\u009c\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u00062\u0007\u0010\u009a\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J \u0010¡\u0001\u001a\u00020\u0006*\u00030\u009c\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¡\u0001\u0010\u009d\u0001J \u0010¢\u0001\u001a\u00020\u0006*\u00030\u009c\u00012\u0007\u0010\u009e\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¢\u0001\u0010\u009d\u0001J5\u0010¥\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0007\u0010\u0090\u0001\u001a\u00020\u00062\u0007\u0010£\u0001\u001a\u00020\u00062\u0007\u0010¤\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J,\u0010§\u0001\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0007\u0010£\u0001\u001a\u00020\u00062\u0007\u0010¤\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b§\u0001\u0010¨\u0001J\"\u0010©\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0007\u0010\u0090\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0005\b©\u0001\u00102J\u0019\u0010ª\u0001\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0005\bª\u0001\u0010\fR\u001d\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u001a\u0010®\u0001\u001a\u00030\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\"\u0010±\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R+\u0010µ\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001a0³\u0001j\t\u0012\u0004\u0012\u00020\u001a`´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R;\u0010\u0093\u0001\u001a$\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020j\u0018\u00010\u0091\u0001j\u0011\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020j\u0018\u0001`\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010·\u0001R#\u0010º\u0001\u001a\f\u0012\u0005\u0012\u00030¹\u0001\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0019\u0010¼\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010¾\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010½\u0001R\u0019\u0010¿\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010½\u0001R\u0019\u0010À\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010½\u0001R\u0019\u0010Á\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010½\u0001R\u0019\u0010Â\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010½\u0001R\u0019\u0010Ã\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010½\u0001R\u0019\u0010Ä\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010½\u0001R\u0017\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000b\u0010½\u0001R\u0018\u0010Æ\u0001\u001a\u00030Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010È\u0001\u001a\u00030Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010Ç\u0001R\u0018\u0010É\u0001\u001a\u00030Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ç\u0001R+\u0010Ë\u0001\u001a\u0014\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ê\u0001\u0018\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010»\u0001R(\u0010Ì\u0001\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bÌ\u0001\u0010½\u0001\u001a\u0005\bÍ\u0001\u0010RR(\u0010Î\u0001\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bÎ\u0001\u0010½\u0001\u001a\u0005\bÏ\u0001\u0010RR&\u0010\u001d\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u001d\u0010½\u0001\u001a\u0005\bÐ\u0001\u0010RR(\u0010Ñ\u0001\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bÑ\u0001\u0010Ò\u0001\u001a\u0005\bÓ\u0001\u0010VR\u001b\u0010Ô\u0001\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010VR\u0016\u0010\u0085\u0001\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÖ\u0001\u0010RR\u0016\u0010¤\u0001\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b×\u0001\u0010R¨\u0006Ù\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "Landroidx/compose/runtime/SlotTable;", "table", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", "index", "", "isNode", "(I)Z", "nodeCount", "(I)I", "groupKey", "groupObjectKey", "(I)Ljava/lang/Object;", "isValid", "hasObjectKey", "groupSize", "groupAux", "indexInParent", "indexInCurrentGroup", "group", "indexInGroup", "(II)Z", "node", "Landroidx/compose/runtime/Anchor;", "anchor", "(Landroidx/compose/runtime/Anchor;)Ljava/lang/Object;", "parent", "normalClose", "", "close", "(Z)V", "reset", "()V", "value", "update", "(Ljava/lang/Object;)Ljava/lang/Object;", "appendSlot", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "count", "trimTailSlots", "(I)V", "updateAux", "(Ljava/lang/Object;)V", "updateToTableMaps", "updateNode", "set", "slotIndexOfGroupSlotIndex", "(II)I", "(IILjava/lang/Object;)Ljava/lang/Object;", "slotIndex", "clear", "skip", "()Ljava/lang/Object;", "slot", "(Landroidx/compose/runtime/Anchor;I)Ljava/lang/Object;", "groupIndex", "(II)Ljava/lang/Object;", "slotsStartIndex$runtime", "slotsStartIndex", "slotsEndIndex$runtime", "slotsEndIndex", "groupSlotIndex", "amount", "advanceBy", "seek", "(Landroidx/compose/runtime/Anchor;)V", "skipToGroupEnd", "beginInsert", "endInsert", "startGroup", "key", "dataKey", "(ILjava/lang/Object;)V", "objectKey", "startNode", "aux", "startData", "(ILjava/lang/Object;Ljava/lang/Object;)V", "endGroup", "()I", "ensureStarted", "skipGroup", "removeGroup", "()Z", "Lkotlin/Function2;", "block", "forAllDataInRememberOrder", "(ILkotlin/jvm/functions/Function2;)V", "offset", "moveGroup", "removeSourceGroup", "", "moveFrom", "(Landroidx/compose/runtime/SlotTable;IZ)Ljava/util/List;", "moveIntoGroupFrom", "(ILandroidx/compose/runtime/SlotTable;I)Ljava/util/List;", "(I)Landroidx/compose/runtime/Anchor;", "markGroup", "anchorIndex", "(Landroidx/compose/runtime/Anchor;)I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/GroupSourceInformation;", "sourceInformationOf$runtime", "(I)Landroidx/compose/runtime/GroupSourceInformation;", "sourceInformationOf", "tryAnchor$runtime", "tryAnchor", "rawUpdate", "(ILjava/lang/Object;ZLjava/lang/Object;)V", "childGroupAtIndex", "containsGroupMark", "containsAnyGroupMarks", "recalculateMarks", "updateContainsMark", "Landroidx/compose/runtime/PrioritySet;", "updateContainsMarkNow-XpTMRCE", "(ILandroidx/collection/MutableIntList;)V", "updateContainsMarkNow", "childContainsAnyMarks", "saveCurrentGroupEnd", "restoreCurrentGroupEnd", "firstChild", "fixParentAnchorsFor", "(III)V", "moveGroupGapTo", "moveSlotGapTo", "(II)V", "clearSlotGap", "size", "insertGroups", "insertSlots", "start", "len", "removeGroups", "removeSlots", "updateNodeOfGroup", "previousGapStart", "newGapStart", "updateAnchors", "gapStart", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "removeAnchors", "(IILjava/util/HashMap;)Z", "originalLocation", "newLocation", "moveAnchors", "groupIndexToAddress", "dataIndex", "dataIndexToDataAddress", "", "([II)I", "address", "updateDataIndex", "([III)V", "nodeIndex", "auxIndex", "gapLen", "capacity", "dataIndexToDataAnchor", "(IIII)I", "dataAnchorToDataIndex", "(III)I", "parentIndexToAnchor", "parentAnchorToIndex", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "groups", "[I", "", "slots", "[Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Ljava/util/ArrayList;", "Ljava/util/HashMap;", "Landroidx/collection/MutableIntObjectMap;", "Landroidx/collection/MutableIntSet;", "calledByMap", "Landroidx/collection/MutableIntObjectMap;", "groupGapStart", "I", "groupGapLen", "currentSlot", "currentSlotEnd", "slotsGapStart", "slotsGapLen", "slotsGapOwner", "insertCount", "Landroidx/compose/runtime/IntStack;", "startStack", "Landroidx/compose/runtime/IntStack;", "endStack", "nodeCountStack", "Landroidx/collection/MutableObjectList;", "deferredSlotWrites", "currentGroup", "getCurrentGroup", "currentGroupEnd", "getCurrentGroupEnd", "getParent", "closed", "Z", "getClosed", "pendingRecalculateMarks", "Landroidx/collection/MutableIntList;", "getSize$runtime", "getCapacity", "Companion", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SlotWriter {

    @NotNull
    private ArrayList<Anchor> anchors;
    private MutableIntObjectMap<MutableIntSet> calledByMap;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private MutableIntObjectMap<MutableObjectList<Object>> deferredSlotWrites;
    private int groupGapLen;
    private int groupGapStart;

    @NotNull
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private MutableIntList pendingRecalculateMarks;

    @NotNull
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;

    @NotNull
    private final SlotTable table;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private final IntStack startStack = new IntStack();

    @NotNull
    private final IntStack endStack = new IntStack();

    @NotNull
    private final IntStack nodeCountStack = new IntStack();
    private int parent = -1;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0002¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/SlotWriter$Companion;", "", "<init>", "()V", "moveGroup", "", "Landroidx/compose/runtime/Anchor;", "fromWriter", "Landroidx/compose/runtime/SlotWriter;", "fromIndex", "", "toWriter", "updateFromCursor", "", "updateToCursor", "removeSourceGroup", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Anchor> moveGroup(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            boolean zRemoveGroups;
            List<Anchor> list;
            int iGroupSize = fromWriter.groupSize(fromIndex);
            int i = fromIndex + iGroupSize;
            int iDataIndex = fromWriter.dataIndex(fromIndex);
            int iDataIndex2 = fromWriter.dataIndex(i);
            int i2 = iDataIndex2 - iDataIndex;
            boolean zContainsAnyGroupMarks = fromWriter.containsAnyGroupMarks(fromIndex);
            toWriter.insertGroups(iGroupSize);
            toWriter.insertSlots(i2, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i) {
                fromWriter.moveGroupGapTo(i);
            }
            if (fromWriter.slotsGapStart < iDataIndex2) {
                fromWriter.moveSlotGapTo(iDataIndex2, i);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            int i3 = currentGroup * 5;
            p.h(fromWriter.groups, iArr, i3, fromIndex * 5, i * 5);
            Object[] objArr = toWriter.slots;
            int i5 = toWriter.currentSlot;
            System.arraycopy(fromWriter.slots, iDataIndex, objArr, i5, i2);
            int parent = toWriter.getParent();
            iArr[i3 + 2] = parent;
            int i6 = currentGroup - fromIndex;
            int i21 = currentGroup + iGroupSize;
            int iDataIndex3 = i5 - toWriter.dataIndex(iArr, currentGroup);
            int i22 = toWriter.slotsGapOwner;
            int i32 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i33 = i22;
            int i43 = currentGroup;
            while (true) {
                zRemoveGroups = false;
                if (i43 >= i21) {
                    break;
                }
                if (i43 != currentGroup) {
                    int i59 = (i43 * 5) + 2;
                    iArr[i59] = iArr[i59] + i6;
                }
                int[] iArr2 = iArr;
                int i66 = currentGroup;
                iArr2[(i43 * 5) + 4] = toWriter.dataIndexToDataAnchor(toWriter.dataIndex(iArr, i43) + iDataIndex3, i33 >= i43 ? toWriter.slotsGapStart : 0, i32, length);
                if (i43 == i33) {
                    i33++;
                }
                i43++;
                currentGroup = i66;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            toWriter.slotsGapOwner = i33;
            int iLocationOf = SlotTableKt.locationOf(fromWriter.anchors, fromIndex, fromWriter.getSize$runtime());
            int iLocationOf2 = SlotTableKt.locationOf(fromWriter.anchors, i, fromWriter.getSize$runtime());
            if (iLocationOf < iLocationOf2) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iLocationOf2 - iLocationOf);
                for (int i74 = iLocationOf; i74 < iLocationOf2; i74++) {
                    Anchor anchor = (Anchor) arrayList.get(i74);
                    anchor.setLocation$runtime(anchor.getLocation() + i6);
                    arrayList2.add(anchor);
                }
                toWriter.anchors.addAll(SlotTableKt.locationOf(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.getSize$runtime()), arrayList2);
                arrayList.subList(iLocationOf, iLocationOf2).clear();
                list = arrayList2;
            } else {
                list = f0.f322471a;
            }
            List<Anchor> list2 = list;
            if (!list2.isEmpty()) {
                HashMap map = fromWriter.sourceInformationMap;
                HashMap map2 = toWriter.sourceInformationMap;
                if (map != null && map2 != null) {
                    int size = list2.size();
                    for (int i92 = 0; i92 < size; i92++) {
                    }
                }
            }
            toWriter.getParent();
            toWriter.sourceInformationOf$runtime(parent);
            int iParent = fromWriter.parent(fromIndex);
            if (removeSourceGroup) {
                if (updateFromCursor) {
                    boolean z = iParent >= 0;
                    if (z) {
                        fromWriter.startGroup();
                        fromWriter.advanceBy(iParent - fromWriter.getCurrentGroup());
                        fromWriter.startGroup();
                    }
                    fromWriter.advanceBy(fromIndex - fromWriter.getCurrentGroup());
                    boolean zRemoveGroup = fromWriter.removeGroup();
                    if (z) {
                        fromWriter.skipToGroupEnd();
                        fromWriter.endGroup();
                        fromWriter.skipToGroupEnd();
                        fromWriter.endGroup();
                    }
                    zRemoveGroups = zRemoveGroup;
                } else {
                    zRemoveGroups = fromWriter.removeGroups(fromIndex, iGroupSize);
                    fromWriter.removeSlots(iDataIndex, i2, fromIndex - 1);
                }
            }
            if (zRemoveGroups) {
                ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
            }
            int i96 = toWriter.nodeCount;
            int i99 = iArr3[i3 + 1];
            toWriter.nodeCount = i96 + ((1073741824 & i99) == 0 ? i99 & 67108863 : 1);
            if (updateToCursor) {
                toWriter.currentGroup = i21;
                toWriter.currentSlot = i5 + i2;
            }
            if (zContainsAnyGroupMarks) {
                toWriter.updateContainsMark(parent);
            }
            return list;
        }

        public static /* synthetic */ List moveGroup$default(Companion companion, SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z3, boolean z4, int i2, Object obj2) {
            if ((i2 & 32) != 0) {
                z4 = true;
            }
            return companion.moveGroup(slotWriter, i, slotWriter2, z, z3, z4);
        }

        private Companion() {
        }
    }

    public SlotWriter(@NotNull SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        this.slots = slotTable.getSlots();
        this.anchors = slotTable.getAnchors$runtime();
        this.sourceInformationMap = slotTable.getSourceInformationMap$runtime();
        this.calledByMap = slotTable.getCalledByMap$runtime();
        this.groupGapStart = slotTable.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - slotTable.getGroupsSize();
        this.slotsGapStart = slotTable.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable.getSlotsSize();
        this.slotsGapOwner = slotTable.getGroupsSize();
        this.currentGroupEnd = slotTable.getGroupsSize();
    }

    private final int auxIndex(int[] iArr, int i) {
        return Integer.bitCount(iArr[(i * 5) + 1] >> 29) + dataIndex(iArr, i);
    }

    private final boolean childContainsAnyMarks(int group) {
        int iGroupSize = group + 1;
        int iGroupSize2 = groupSize(group) + group;
        while (iGroupSize < iGroupSize2) {
            if ((this.groups[(groupIndexToAddress(iGroupSize) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iGroupSize += groupSize(iGroupSize);
        }
        return false;
    }

    private final int childGroupAtIndex(int parent, int index) {
        int iGroupSize = groupSize(parent) + parent;
        int iGroupSize2 = parent + 1;
        int i = 0;
        while (iGroupSize2 < iGroupSize && i < index) {
            int iGroupIndexToAddress = groupIndexToAddress(iGroupSize2);
            iGroupSize2 += SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
            if (iGroupSize2 < iGroupSize && (this.groups[(iGroupIndexToAddress * 5) + 1] & PKIFailureInfo.duplicateCertReq) == 0) {
                i++;
            }
        }
        return iGroupSize2;
    }

    private final void clearSlotGap() {
        int i = this.slotsGapStart;
        p.p(this.slots, i, this.slotsGapLen + i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean containsAnyGroupMarks(int group) {
        return group >= 0 && (this.groups[(groupIndexToAddress(group) * 5) + 1] & 201326592) != 0;
    }

    private final boolean containsGroupMark(int group) {
        return group >= 0 && (this.groups[(groupIndexToAddress(group) * 5) + 1] & 67108864) != 0;
    }

    private final int dataAnchorToDataIndex(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int index) {
        return dataIndex(this.groups, groupIndexToAddress(index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAddress(int dataIndex) {
        return (this.slotsGapLen * (dataIndex < this.slotsGapStart ? 0 : 1)) + dataIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndexToDataAnchor(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    private final void fixParentAnchorsFor(int parent, int endGroup, int firstChild) {
        int iParentIndexToAnchor = parentIndexToAnchor(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            this.groups[(groupIndexToAddress(firstChild) * 5) + 2] = iParentIndexToAnchor;
            int iGroupSize = SlotTableKt.groupSize(this.groups, groupIndexToAddress(firstChild)) + firstChild;
            fixParentAnchorsFor(firstChild, iGroupSize, firstChild + 1);
            firstChild = iGroupSize;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    private final int groupIndexToAddress(int index) {
        return (this.groupGapLen * (index < this.groupGapStart ? 0 : 1)) + index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGroups(int size) {
        if (size > 0) {
            int i = this.currentGroup;
            moveGroupGapTo(i);
            int i2 = this.groupGapStart;
            int i3 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i5 = length - i3;
            if (i3 < size) {
                int iMax = Math.max(Math.max(length * 2, i5 + size), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                p.h(iArr, iArr2, 0, 0, i2 * 5);
                p.h(iArr, iArr2, (i2 + i6) * 5, (i3 + i2) * 5, length * 5);
                this.groups = iArr2;
                i3 = i6;
            }
            int i21 = this.currentGroupEnd;
            if (i21 >= i2) {
                this.currentGroupEnd = i21 + size;
            }
            int i22 = i2 + size;
            this.groupGapStart = i22;
            this.groupGapLen = i3 - size;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(i5 > 0 ? dataIndex(i + size) : 0, this.slotsGapOwner >= i2 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i32 = i2; i32 < i22; i32++) {
                this.groups[(i32 * 5) + 4] = iDataIndexToDataAnchor;
            }
            int i33 = this.slotsGapOwner;
            if (i33 >= i2) {
                this.slotsGapOwner = i33 + size;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertSlots(int size, int group) {
        if (size > 0) {
            moveSlotGapTo(this.currentSlot, group);
            int i = this.slotsGapStart;
            int i2 = this.slotsGapLen;
            if (i2 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i3 = length - i2;
                int iMax = Math.max(Math.max(length * 2, i3 + size), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i5 = 0; i5 < iMax; i5++) {
                    objArr2[i5] = null;
                }
                int i6 = iMax - i3;
                int i21 = i2 + i;
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(objArr, i21, objArr2, i + i6, length - i21);
                this.slots = objArr2;
                i2 = i6;
            }
            int i22 = this.currentSlotEnd;
            if (i22 >= i) {
                this.currentSlotEnd = i22 + size;
            }
            this.slotsGapStart = i + size;
            this.slotsGapLen = i2 - size;
        }
    }

    public static /* synthetic */ void markGroup$default(SlotWriter slotWriter, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = slotWriter.parent;
        }
        slotWriter.markGroup(i);
    }

    private final void moveAnchors(int originalLocation, int newLocation, int size) {
        Anchor anchor;
        int iAnchorIndex;
        int i = size + originalLocation;
        int size$runtime = getSize$runtime();
        int iLocationOf = SlotTableKt.locationOf(this.anchors, originalLocation, size$runtime);
        ArrayList arrayList = new ArrayList();
        if (iLocationOf >= 0) {
            while (iLocationOf < this.anchors.size() && (iAnchorIndex = anchorIndex((anchor = this.anchors.get(iLocationOf)))) >= originalLocation && iAnchorIndex < i) {
                arrayList.add(anchor);
                this.anchors.remove(iLocationOf);
            }
        }
        int i2 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Anchor anchor2 = (Anchor) arrayList.get(i3);
            int iAnchorIndex2 = anchorIndex(anchor2) + i2;
            if (iAnchorIndex2 >= this.groupGapStart) {
                anchor2.setLocation$runtime(-(size$runtime - iAnchorIndex2));
            } else {
                anchor2.setLocation$runtime(iAnchorIndex2);
            }
            this.anchors.add(SlotTableKt.locationOf(this.anchors, iAnchorIndex2, size$runtime), anchor2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveGroupGapTo(int index) {
        int i = this.groupGapLen;
        int i2 = this.groupGapStart;
        if (i2 != index) {
            if (!this.anchors.isEmpty()) {
                updateAnchors(i2, index);
            }
            if (i > 0) {
                int[] iArr = this.groups;
                int i3 = index * 5;
                int i5 = i * 5;
                int i6 = i2 * 5;
                if (index < i2) {
                    p.h(iArr, iArr, i5 + i3, i3, i6);
                } else {
                    p.h(iArr, iArr, i6, i6 + i5, i3 + i5);
                }
            }
            if (index < i2) {
                i2 = index + i;
            }
            int capacity = getCapacity();
            if (i2 >= capacity) {
                ComposerKt.composeImmediateRuntimeError("Check failed");
            }
            while (i2 < capacity) {
                int i21 = (i2 * 5) + 2;
                int i22 = this.groups[i21];
                int iParentIndexToAnchor = parentIndexToAnchor(parentAnchorToIndex(i22), index);
                if (iParentIndexToAnchor != i22) {
                    this.groups[i21] = iParentIndexToAnchor;
                }
                i2++;
                if (i2 == index) {
                    i2 += i;
                }
            }
        }
        this.groupGapStart = index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveSlotGapTo(int index, int group) {
        int i = this.slotsGapLen;
        int i2 = this.slotsGapStart;
        int i3 = this.slotsGapOwner;
        if (i2 != index) {
            Object[] objArr = this.slots;
            if (index < i2) {
                System.arraycopy(objArr, index, objArr, index + i, i2 - index);
            } else {
                int i5 = i2 + i;
                System.arraycopy(objArr, i5, objArr, i2, (index + i) - i5);
            }
        }
        int iMin = Math.min(group + 1, getSize$runtime());
        if (i3 != iMin) {
            int length = this.slots.length - i;
            if (iMin < i3) {
                int iGroupIndexToAddress = groupIndexToAddress(iMin);
                int iGroupIndexToAddress2 = groupIndexToAddress(i3);
                int i6 = this.groupGapStart;
                while (iGroupIndexToAddress < iGroupIndexToAddress2) {
                    int i21 = (iGroupIndexToAddress * 5) + 4;
                    int i22 = this.groups[i21];
                    if (!(i22 >= 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    this.groups[i21] = -((length - i22) + 1);
                    iGroupIndexToAddress++;
                    if (iGroupIndexToAddress == i6) {
                        iGroupIndexToAddress += this.groupGapLen;
                    }
                }
            } else {
                int iGroupIndexToAddress3 = groupIndexToAddress(i3);
                int iGroupIndexToAddress4 = groupIndexToAddress(iMin);
                while (iGroupIndexToAddress3 < iGroupIndexToAddress4) {
                    int i32 = (iGroupIndexToAddress3 * 5) + 4;
                    int i33 = this.groups[i32];
                    if (!(i33 < 0)) {
                        ComposerKt.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    this.groups[i32] = i33 + length + 1;
                    iGroupIndexToAddress3++;
                    if (iGroupIndexToAddress3 == this.groupGapStart) {
                        iGroupIndexToAddress3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = index;
    }

    private final int nodeIndex(int[] iArr, int i) {
        return dataIndex(iArr, i);
    }

    private final int parentAnchorToIndex(int index) {
        return index > -2 ? index : (getSize$runtime() + index) - (-2);
    }

    private final int parentIndexToAnchor(int index, int gapStart) {
        return index < gapStart ? index : -((getSize$runtime() - index) + 2);
    }

    private final Object rawUpdate(Object value) {
        Object objSkip = skip();
        set(value);
        return objSkip;
    }

    private final void recalculateMarks() {
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m1647isNotEmptyimpl(mutableIntList)) {
                m1650updateContainsMarkNowXpTMRCE(PrioritySet.m1649takeMaximpl(mutableIntList), mutableIntList);
            }
        }
    }

    private final boolean removeAnchors(int gapStart, int size, HashMap<Anchor, GroupSourceInformation> sourceInformationMap) {
        int i = size + gapStart;
        int iLocationOf = SlotTableKt.locationOf(this.anchors, i, getCapacity() - this.groupGapLen);
        if (iLocationOf >= this.anchors.size()) {
            iLocationOf--;
        }
        int i2 = iLocationOf + 1;
        int i3 = 0;
        while (iLocationOf >= 0) {
            Anchor anchor = this.anchors.get(iLocationOf);
            int iAnchorIndex = anchorIndex(anchor);
            if (iAnchorIndex < gapStart) {
                break;
            }
            if (iAnchorIndex < i) {
                anchor.setLocation$runtime(Integer.MIN_VALUE);
                if (sourceInformationMap != null) {
                    sourceInformationMap.remove(anchor);
                }
                if (i3 == 0) {
                    i3 = iLocationOf + 1;
                }
                i2 = iLocationOf;
            }
            iLocationOf--;
        }
        boolean z = i2 < i3;
        if (z) {
            this.anchors.subList(i2, i3).clear();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeGroups(int start, int len) {
        if (len > 0) {
            ArrayList<Anchor> arrayList = this.anchors;
            moveGroupGapTo(start);
            zRemoveAnchors = arrayList.isEmpty() ? false : removeAnchors(start, len, this.sourceInformationMap);
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i = this.slotsGapOwner;
            if (i > start) {
                this.slotsGapOwner = Math.max(start, i - len);
            }
            int i2 = this.currentGroupEnd;
            if (i2 >= this.groupGapStart) {
                this.currentGroupEnd = i2 - len;
            }
            int i3 = this.parent;
            if (containsGroupMark(i3)) {
                updateContainsMark(i3);
            }
        }
        return zRemoveAnchors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSlots(int start, int len, int group) {
        if (len > 0) {
            int i = this.slotsGapLen;
            int i2 = start + len;
            moveSlotGapTo(i2, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i + len;
            p.p(this.slots, start, i2, null);
            int i3 = this.currentSlotEnd;
            if (i3 >= start) {
                this.currentSlotEnd = i3 - len;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int capacity = (getCapacity() - this.groupGapLen) - this.endStack.pop();
        this.currentGroupEnd = capacity;
        return capacity;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push((getCapacity() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int slotIndex(int[] iArr, int i) {
        return i >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(SlotTableKt.slotAnchor(iArr, i), this.slotsGapLen, this.slots.length);
    }

    private final void updateAnchors(int previousGapStart, int newGapStart) {
        Anchor anchor;
        int location$runtime;
        Anchor anchor2;
        int location$runtime2;
        int i;
        int capacity = getCapacity() - this.groupGapLen;
        if (previousGapStart >= newGapStart) {
            for (int iLocationOf = SlotTableKt.locationOf(this.anchors, newGapStart, capacity); iLocationOf < this.anchors.size() && (location$runtime = (anchor = this.anchors.get(iLocationOf)).getLocation()) >= 0; iLocationOf++) {
                anchor.setLocation$runtime(-(capacity - location$runtime));
            }
            return;
        }
        for (int iLocationOf2 = SlotTableKt.locationOf(this.anchors, previousGapStart, capacity); iLocationOf2 < this.anchors.size() && (location$runtime2 = (anchor2 = this.anchors.get(iLocationOf2)).getLocation()) < 0 && (i = location$runtime2 + capacity) < newGapStart; iLocationOf2++) {
            anchor2.setLocation$runtime(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateContainsMark(int group) {
        if (group >= 0) {
            MutableIntList mutableIntListM1646constructorimpl$default = this.pendingRecalculateMarks;
            if (mutableIntListM1646constructorimpl$default == null) {
                mutableIntListM1646constructorimpl$default = PrioritySet.m1646constructorimpl$default(null, 1, null);
                this.pendingRecalculateMarks = mutableIntListM1646constructorimpl$default;
            }
            PrioritySet.m1644addimpl(mutableIntListM1646constructorimpl$default, group);
        }
    }

    /* JADX INFO: renamed from: updateContainsMarkNow-XpTMRCE, reason: not valid java name */
    private final void m1650updateContainsMarkNowXpTMRCE(int group, MutableIntList set) {
        int iGroupIndexToAddress = groupIndexToAddress(group);
        boolean zChildContainsAnyMarks = childContainsAnyMarks(group);
        int[] iArr = this.groups;
        if (((iArr[(iGroupIndexToAddress * 5) + 1] & 67108864) != 0) != zChildContainsAnyMarks) {
            SlotTableKt.updateContainsMark(iArr, iGroupIndexToAddress, zChildContainsAnyMarks);
            int iParent = parent(group);
            if (iParent >= 0) {
                PrioritySet.m1644addimpl(set, iParent);
            }
        }
    }

    private final void updateDataIndex(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = dataIndexToDataAnchor(i2, this.slotsGapStart, this.slotsGapLen, this.slots.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateNodeOfGroup(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.groupIndexToAddress(r5)
            int[] r1 = r4.groups
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            androidx.compose.runtime.ComposerKt.composeImmediateRuntimeError(r5)
        L2e:
            java.lang.Object[] r5 = r4.slots
            int[] r1 = r4.groups
            int r0 = r4.nodeIndex(r1, r0)
            int r0 = r4.dataIndexToDataAddress(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SlotWriter.updateNodeOfGroup(int, java.lang.Object):void");
    }

    public final void advanceBy(int amount) {
        boolean z = false;
        if (!(amount >= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            PreconditionsKt.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (amount == 0) {
            return;
        }
        int i = this.currentGroup + amount;
        if (i >= this.parent && i <= this.currentGroupEnd) {
            z = true;
        }
        if (!z) {
            ComposerKt.composeImmediateRuntimeError("Cannot seek outside the current group (" + this.parent + CoreConstants.DASH_CHAR + this.currentGroupEnd + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        this.currentGroup = i;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i));
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
    }

    @NotNull
    public final Anchor anchor(int index) {
        ArrayList<Anchor> arrayList = this.anchors;
        int iSearch = SlotTableKt.search(arrayList, index, getSize$runtime());
        if (iSearch >= 0) {
            return arrayList.get(iSearch);
        }
        if (index > this.groupGapStart) {
            index = -(getSize$runtime() - index);
        }
        Anchor anchor = new Anchor(index);
        arrayList.add(-(iSearch + 1), anchor);
        return anchor;
    }

    public final int anchorIndex(@NotNull Anchor anchor) {
        int location$runtime = anchor.getLocation();
        return location$runtime < 0 ? getSize$runtime() + location$runtime : location$runtime;
    }

    public final void appendSlot(@NotNull Anchor anchor, Object value) {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int i = this.currentSlot;
        int i2 = this.currentSlotEnd;
        int iAnchorIndex = anchorIndex(anchor);
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(iAnchorIndex + 1));
        this.currentSlot = iDataIndex;
        this.currentSlotEnd = iDataIndex;
        insertSlots(1, iAnchorIndex);
        if (i >= iDataIndex) {
            i++;
            i2++;
        }
        this.slots[iDataIndex] = value;
        this.currentSlot = i;
        this.currentSlotEnd = i2;
    }

    public final void beginInsert() {
        int i = this.insertCount;
        this.insertCount = i + 1;
        if (i == 0) {
            saveCurrentGroupEnd();
        }
    }

    public final Object clear(int slotIndex) {
        int iDataIndexToDataAddress = dataIndexToDataAddress(slotIndex);
        Object[] objArr = this.slots;
        Object obj2 = objArr[iDataIndexToDataAddress];
        objArr[iDataIndexToDataAddress] = Composer.INSTANCE.getEmpty();
        return obj2;
    }

    public final void close(boolean normalClose) {
        this.closed = true;
        if (normalClose && this.startStack.tos == 0) {
            moveGroupGapTo(getSize$runtime());
            moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
            clearSlotGap();
            recalculateMarks();
        }
        this.table.close$runtime(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final int endGroup() {
        MutableObjectList<Object> mutableObjectList;
        boolean z = this.insertCount > 0;
        int i = this.currentGroup;
        int i2 = this.currentGroupEnd;
        int i3 = this.parent;
        int iGroupIndexToAddress = groupIndexToAddress(i3);
        int i5 = this.nodeCount;
        int i6 = i - i3;
        int i21 = (iGroupIndexToAddress * 5) + 1;
        boolean z3 = (this.groups[i21] & 1073741824) != 0;
        if (z) {
            MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
            if (mutableIntObjectMap != null && (mutableObjectList = mutableIntObjectMap.get(i3)) != null) {
                Object[] objArr = mutableObjectList.content;
                int i22 = mutableObjectList._size;
                for (int i32 = 0; i32 < i22; i32++) {
                    rawUpdate(objArr[i32]);
                }
                mutableIntObjectMap.remove(i3);
            }
            SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress, i6);
            SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i5);
            this.nodeCount = this.nodeCountStack.pop() + (z3 ? 1 : i5);
            int iParent = parent(this.groups, i3);
            this.parent = iParent;
            int size$runtime = iParent < 0 ? getSize$runtime() : groupIndexToAddress(iParent + 1);
            int iDataIndex = size$runtime >= 0 ? dataIndex(this.groups, size$runtime) : 0;
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            return i5;
        }
        if (!(i == i2)) {
            ComposerKt.composeImmediateRuntimeError("Expected to be at the end of a group");
        }
        int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress);
        int[] iArr = this.groups;
        int i33 = iArr[i21] & 67108863;
        SlotTableKt.updateGroupSize(iArr, iGroupIndexToAddress, i6);
        SlotTableKt.updateNodeCount(this.groups, iGroupIndexToAddress, i5);
        int iPop = this.startStack.pop();
        restoreCurrentGroupEnd();
        this.parent = iPop;
        int iParent2 = parent(this.groups, i3);
        int iPop2 = this.nodeCountStack.pop();
        this.nodeCount = iPop2;
        if (iParent2 == iPop) {
            this.nodeCount = iPop2 + (z3 ? 0 : i5 - i33);
            return i5;
        }
        int i43 = i6 - iGroupSize;
        int i59 = z3 ? 0 : i5 - i33;
        if (i43 != 0 || i59 != 0) {
            while (iParent2 != 0 && iParent2 != iPop && (i59 != 0 || i43 != 0)) {
                int iGroupIndexToAddress2 = groupIndexToAddress(iParent2);
                if (i43 != 0) {
                    SlotTableKt.updateGroupSize(this.groups, iGroupIndexToAddress2, SlotTableKt.groupSize(this.groups, iGroupIndexToAddress2) + i43);
                }
                if (i59 != 0) {
                    int[] iArr2 = this.groups;
                    SlotTableKt.updateNodeCount(iArr2, iGroupIndexToAddress2, (iArr2[(iGroupIndexToAddress2 * 5) + 1] & 67108863) + i59);
                }
                int[] iArr3 = this.groups;
                if ((iArr3[(iGroupIndexToAddress2 * 5) + 1] & 1073741824) != 0) {
                    i59 = 0;
                }
                iParent2 = parent(iArr3, iParent2);
            }
        }
        this.nodeCount += i59;
        return i5;
    }

    public final void endInsert() {
        if (!(this.insertCount > 0)) {
            PreconditionsKt.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i = this.insertCount - 1;
        this.insertCount = i;
        if (i == 0) {
            if (!(this.nodeCountStack.tos == this.startStack.tos)) {
                ComposerKt.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            restoreCurrentGroupEnd();
        }
    }

    public final void ensureStarted(int index) {
        boolean z = false;
        if (!(this.insertCount <= 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i = this.parent;
        if (i != index) {
            if (index >= i && index < this.currentGroupEnd) {
                z = true;
            }
            if (!z) {
                ComposerKt.composeImmediateRuntimeError("Started group at " + index + " must be a subgroup of the group at " + i);
            }
            int i2 = this.currentGroup;
            int i3 = this.currentSlot;
            int i5 = this.currentSlotEnd;
            this.currentGroup = index;
            startGroup();
            this.currentGroup = i2;
            this.currentSlot = i3;
            this.currentSlotEnd = i5;
        }
    }

    public final void forAllDataInRememberOrder(int group, @NotNull Function2<? super Integer, Object, Unit> block) {
        int i;
        int i2;
        int afterGroupIndex;
        Function2<? super Integer, Object, Unit> function2 = block;
        int iParent = parent(group);
        int size$runtime = getSize$runtime();
        int iGroupSize = groupSize(group) + group;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i3 = group;
        MutableIntSet mutableIntSetMutableIntSetOf = null;
        MutableIntList mutableIntList = null;
        while (i3 < iGroupSize) {
            int iDataIndex = dataIndex(i3);
            int i5 = i3 + 1;
            int iDataIndex2 = dataIndex(i5);
            while (true) {
                i = 0;
                if (iDataIndex >= iDataIndex2) {
                    break;
                }
                Object obj2 = this.slots[dataIndexToDataAddress(iDataIndex)];
                if (!(obj2 instanceof RememberObserverHolder) || (afterGroupIndex = ((RememberObserverHolder) obj2).getAfterGroupIndex()) < 0) {
                    function2.invoke(Integer.valueOf(iDataIndex), obj2);
                } else {
                    int iChildGroupAtIndex = childGroupAtIndex(i3, afterGroupIndex);
                    if (mutableIntSetMutableIntSetOf == null) {
                        mutableIntSetMutableIntSetOf = IntSetKt.mutableIntSetOf();
                    }
                    if (mutableIntList == null) {
                        mutableIntList = new MutableIntList(i, 1, defaultConstructorMarker);
                    }
                    mutableIntSetMutableIntSetOf.add(iChildGroupAtIndex);
                    mutableIntList.add(iChildGroupAtIndex);
                    mutableIntList.add(iDataIndex);
                }
                iDataIndex++;
            }
            int iParent2 = i5 < size$runtime ? parent(i5) : -1;
            if (iParent2 != i3) {
                while (true) {
                    if (mutableIntList == null || mutableIntSetMutableIntSetOf == null || !mutableIntSetMutableIntSetOf.remove(i3)) {
                        i2 = size$runtime;
                    } else {
                        int i6 = mutableIntList._size;
                        int i21 = i6 / 2;
                        int i22 = i;
                        int i32 = i22;
                        while (i32 < i21) {
                            int i33 = i32 * 2;
                            int i43 = size$runtime;
                            int i59 = mutableIntList.get(i33);
                            if (i59 == i3) {
                                int i66 = mutableIntList.get(i33 + 1);
                                function2.invoke(Integer.valueOf(i66), this.slots[dataIndexToDataAddress(i66)]);
                            } else if (i33 != i22) {
                                int i74 = i22 + 1;
                                mutableIntList.set(i22, i59);
                                i22 += 2;
                                mutableIntList.set(i74, mutableIntList.get(i33 + 1));
                            } else {
                                i22 += 2;
                            }
                            i32++;
                            function2 = block;
                            size$runtime = i43;
                        }
                        i2 = size$runtime;
                        if (i22 != i6) {
                            mutableIntList.removeRange(i22, i6);
                        }
                    }
                    if (i3 == group || iParent == iParent2) {
                        break;
                    }
                    i3 = iParent;
                    size$runtime = i2;
                    i = 0;
                    iParent = parent(iParent);
                    function2 = block;
                }
            } else {
                i2 = size$runtime;
            }
            function2 = block;
            iParent = iParent2;
            i3 = i5;
            size$runtime = i2;
            defaultConstructorMarker = null;
        }
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime() {
        return getCapacity() - this.groupGapLen;
    }

    @NotNull
    /* JADX INFO: renamed from: getTable$runtime, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final Object groupAux(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        return (iArr[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0 ? this.slots[auxIndex(iArr, iGroupIndexToAddress)] : Composer.INSTANCE.getEmpty();
    }

    public final int groupKey(int index) {
        return this.groups[groupIndexToAddress(index) * 5];
    }

    public final Object groupObjectKey(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        if ((iArr[(iGroupIndexToAddress * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, iGroupIndexToAddress)];
        }
        return null;
    }

    public final int groupSize(int index) {
        return SlotTableKt.groupSize(this.groups, groupIndexToAddress(index));
    }

    public final int groupSlotIndex(int group) {
        MutableObjectList<Object> mutableObjectList;
        int iSlotsStartIndex$runtime = this.currentSlot - slotsStartIndex$runtime(group);
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        return iSlotsStartIndex$runtime + ((mutableIntObjectMap == null || (mutableObjectList = mutableIntObjectMap.get(group)) == null) ? 0 : mutableObjectList.get_size());
    }

    public final boolean hasObjectKey(int index) {
        return (this.groups[(groupIndexToAddress(index) * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public final boolean indexInCurrentGroup(int index) {
        return indexInGroup(index, this.currentGroup);
    }

    public final boolean indexInGroup(int index, int group) {
        int iIndexOf;
        int capacity;
        if (group == this.parent) {
            capacity = this.currentGroupEnd;
        } else if (group <= this.startStack.peekOr(0) && (iIndexOf = this.startStack.indexOf(group)) >= 0) {
            capacity = (getCapacity() - this.groupGapLen) - this.endStack.peek(iIndexOf);
        } else {
            int iGroupSize = groupSize(group);
            capacity = iGroupSize + group;
        }
        return index > group && index < capacity;
    }

    public final boolean indexInParent(int index) {
        int i = this.parent;
        if (index <= i || index >= this.currentGroupEnd) {
            return i == 0 && index == 0;
        }
        return true;
    }

    public final boolean isNode() {
        int i = this.currentGroup;
        return i < this.currentGroupEnd && (this.groups[(groupIndexToAddress(i) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean isValid(int index) {
        return groupIndexToAddress(index) * 5 < this.groups.length;
    }

    public final void markGroup(int group) {
        int iGroupIndexToAddress = groupIndexToAddress(group);
        int[] iArr = this.groups;
        int i = (iGroupIndexToAddress * 5) + 1;
        if ((iArr[i] & 134217728) != 0) {
            return;
        }
        SlotTableKt.updateMark(iArr, iGroupIndexToAddress, true);
        if ((this.groups[i] & 67108864) != 0) {
            return;
        }
        updateContainsMark(parent(group));
    }

    @NotNull
    public final List<Anchor> moveFrom(@NotNull SlotTable table, int index, boolean removeSourceGroup) {
        if (!(this.insertCount > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0 || SlotTableKt.groupSize(table.getGroups(), index) != table.getGroupsSize()) {
            SlotWriter slotWriterOpenWriter = table.openWriter();
            try {
                List<Anchor> listMoveGroup = INSTANCE.moveGroup(slotWriterOpenWriter, index, this, true, true, removeSourceGroup);
                slotWriterOpenWriter.close(true);
                return listMoveGroup;
            } catch (Throwable th10) {
                slotWriterOpenWriter.close(false);
                throw th10;
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList<Anchor> arrayList = this.anchors;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        MutableIntObjectMap<MutableIntSet> mutableIntObjectMap = this.calledByMap;
        int[] groups = table.getGroups();
        int groupsSize = table.getGroupsSize();
        Object[] slots = table.getSlots();
        int slotsSize = table.getSlotsSize();
        HashMap<Anchor, GroupSourceInformation> sourceInformationMap$runtime = table.getSourceInformationMap$runtime();
        MutableIntObjectMap<MutableIntSet> calledByMap$runtime = table.getCalledByMap$runtime();
        this.groups = groups;
        this.slots = slots;
        this.anchors = table.getAnchors$runtime();
        this.groupGapStart = groupsSize;
        this.groupGapLen = (groups.length / 5) - groupsSize;
        this.slotsGapStart = slotsSize;
        this.slotsGapLen = slots.length - slotsSize;
        this.slotsGapOwner = groupsSize;
        this.sourceInformationMap = sourceInformationMap$runtime;
        this.calledByMap = calledByMap$runtime;
        table.setTo$runtime(iArr, 0, objArr, 0, arrayList, map, mutableIntObjectMap);
        return this.anchors;
    }

    public final void moveGroup(int offset) {
        if (this.insertCount != 0) {
            ComposerKt.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if (offset < 0) {
            ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if (offset == 0) {
            return;
        }
        int i = this.currentGroup;
        int i2 = this.parent;
        int i3 = this.currentGroupEnd;
        int iGroupSize = i;
        for (int i5 = offset; i5 > 0; i5--) {
            iGroupSize += SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
            if (iGroupSize > i3) {
                ComposerKt.composeImmediateRuntimeError("Parameter offset is out of bounds");
            }
        }
        int iGroupSize2 = SlotTableKt.groupSize(this.groups, groupIndexToAddress(iGroupSize));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(this.currentGroup));
        int iDataIndex2 = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i6 = iGroupSize + iGroupSize2;
        int iDataIndex3 = dataIndex(this.groups, groupIndexToAddress(i6));
        int i21 = iDataIndex3 - iDataIndex2;
        insertSlots(i21, Math.max(this.currentGroup - 1, 0));
        insertGroups(iGroupSize2);
        int[] iArr = this.groups;
        int iGroupIndexToAddress = groupIndexToAddress(i6) * 5;
        p.h(iArr, iArr, groupIndexToAddress(i) * 5, iGroupIndexToAddress, (iGroupSize2 * 5) + iGroupIndexToAddress);
        if (i21 > 0) {
            Object[] objArr = this.slots;
            int iDataIndexToDataAddress = dataIndexToDataAddress(iDataIndex2 + i21);
            System.arraycopy(objArr, iDataIndexToDataAddress, objArr, iDataIndex, dataIndexToDataAddress(iDataIndex3 + i21) - iDataIndexToDataAddress);
        }
        int i22 = iDataIndex2 + i21;
        int i32 = i22 - iDataIndex;
        int i33 = this.slotsGapStart;
        int i43 = this.slotsGapLen;
        int length = this.slots.length;
        int i59 = this.slotsGapOwner;
        int i66 = i + iGroupSize2;
        int i74 = i;
        while (i74 < i66) {
            int iGroupIndexToAddress2 = groupIndexToAddress(i74);
            int i92 = i32;
            int iDataIndex4 = dataIndex(iArr, iGroupIndexToAddress2) - i92;
            int i96 = i33;
            if (i59 < iGroupIndexToAddress2) {
                i33 = 0;
            }
            updateDataIndex(iArr, iGroupIndexToAddress2, dataIndexToDataAnchor(iDataIndex4, i33, i43, length));
            i74++;
            i33 = i96;
            i32 = i92;
        }
        moveAnchors(i6, i, iGroupSize2);
        if (removeGroups(i6, iGroupSize2)) {
            ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
        }
        fixParentAnchorsFor(i2, this.currentGroupEnd, i);
        if (i21 > 0) {
            removeSlots(i22, i21, i6 - 1);
        }
    }

    @NotNull
    public final List<Anchor> moveIntoGroupFrom(int offset, @NotNull SlotTable table, int index) {
        if (!(this.insertCount <= 0 && groupSize(this.currentGroup + offset) == 1)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i = this.currentGroup;
        int i2 = this.currentSlot;
        int i3 = this.currentSlotEnd;
        advanceBy(offset);
        startGroup();
        beginInsert();
        SlotWriter slotWriterOpenWriter = table.openWriter();
        try {
            List<Anchor> listMoveGroup$default = Companion.moveGroup$default(INSTANCE, slotWriterOpenWriter, index, this, false, true, false, 32, null);
            slotWriterOpenWriter.close(true);
            endInsert();
            endGroup();
            this.currentGroup = i;
            this.currentSlot = i2;
            this.currentSlotEnd = i3;
            return listMoveGroup$default;
        } catch (Throwable th10) {
            slotWriterOpenWriter.close(false);
            throw th10;
        }
    }

    public final Object node(int index) {
        int iGroupIndexToAddress = groupIndexToAddress(index);
        int[] iArr = this.groups;
        if ((iArr[(iGroupIndexToAddress * 5) + 1] & 1073741824) != 0) {
            return this.slots[dataIndexToDataAddress(nodeIndex(iArr, iGroupIndexToAddress))];
        }
        return null;
    }

    public final int nodeCount(int index) {
        return this.groups[(groupIndexToAddress(index) * 5) + 1] & 67108863;
    }

    public final int parent(int index) {
        return parent(this.groups, index);
    }

    public final boolean removeGroup() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i = this.currentGroup;
        int i2 = this.currentSlot;
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i));
        int iSkipGroup = skipGroup();
        sourceInformationOf$runtime(this.parent);
        MutableIntList mutableIntList = this.pendingRecalculateMarks;
        if (mutableIntList != null) {
            while (PrioritySet.m1647isNotEmptyimpl(mutableIntList) && PrioritySet.m1648peekimpl(mutableIntList) >= i) {
                PrioritySet.m1649takeMaximpl(mutableIntList);
            }
        }
        boolean zRemoveGroups = removeGroups(i, this.currentGroup - i);
        removeSlots(iDataIndex, this.currentSlot - iDataIndex, i - 1);
        this.currentGroup = i;
        this.currentSlot = i2;
        this.nodeCount -= iSkipGroup;
        return zRemoveGroups;
    }

    public final void reset() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        recalculateMarks();
        this.currentGroup = 0;
        this.currentGroupEnd = getCapacity() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final void seek(@NotNull Anchor anchor) {
        advanceBy(anchor.toIndexFor(this) - this.currentGroup);
    }

    public final void set(Object value) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            ComposerKt.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.slots[dataIndexToDataAddress(this.currentSlot - 1)] = value;
    }

    public final Object skip() {
        if (this.insertCount > 0) {
            insertSlots(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i = this.currentSlot;
        this.currentSlot = i + 1;
        return objArr[dataIndexToDataAddress(i)];
    }

    public final int skipGroup() {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        int iGroupSize = SlotTableKt.groupSize(this.groups, iGroupIndexToAddress) + this.currentGroup;
        this.currentGroup = iGroupSize;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(iGroupSize));
        int i = this.groups[(iGroupIndexToAddress * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    public final void skipToGroupEnd() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.currentSlot = dataIndex(this.groups, groupIndexToAddress(i));
    }

    public final Object slot(@NotNull Anchor anchor, int index) {
        return slot(anchorIndex(anchor), index);
    }

    public final int slotIndexOfGroupSlotIndex(int group, int index) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(group));
        int i = iSlotIndex + index;
        if (!(i >= iSlotIndex && i < dataIndex(this.groups, groupIndexToAddress(group + 1)))) {
            ComposerKt.composeImmediateRuntimeError("Write to an invalid slot index " + index + " for group " + group);
        }
        return i;
    }

    public final int slotsEndIndex$runtime(int groupIndex) {
        return dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
    }

    public final int slotsStartIndex$runtime(int groupIndex) {
        return slotIndex(this.groups, groupIndexToAddress(groupIndex));
    }

    public final GroupSourceInformation sourceInformationOf$runtime(int group) {
        Anchor anchorTryAnchor$runtime;
        HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
        if (map == null || (anchorTryAnchor$runtime = tryAnchor$runtime(group)) == null) {
            return null;
        }
        return map.get(anchorTryAnchor$runtime);
    }

    public final void startData(int key, Object objectKey, Object aux) {
        startGroup(key, objectKey, false, aux);
    }

    public final void startGroup() {
        if (!(this.insertCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        Composer.Companion companion = Composer.INSTANCE;
        startGroup(0, companion.getEmpty(), false, companion.getEmpty());
    }

    public final void startNode(int key, Object objectKey) {
        startGroup(key, objectKey, true, Composer.INSTANCE.getEmpty());
    }

    @NotNull
    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + getSize$runtime() + " gap=" + this.groupGapStart + CoreConstants.DASH_CHAR + (this.groupGapStart + this.groupGapLen) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final void trimTailSlots(int count) {
        if (!(count > 0)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        int i = this.parent;
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(i));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i + 1)) - count;
        if (!(iDataIndex >= iSlotIndex)) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        removeSlots(iDataIndex, count, i);
        int i2 = this.currentSlot;
        if (i2 >= iSlotIndex) {
            this.currentSlot = i2 - count;
        }
    }

    public final Anchor tryAnchor$runtime(int group) {
        if (group < 0 || group >= getSize$runtime()) {
            return null;
        }
        return SlotTableKt.find(this.anchors, group, getSize$runtime());
    }

    public final Object update(Object value) {
        if (this.insertCount <= 0 || this.currentSlot == this.slotsGapStart) {
            return rawUpdate(value);
        }
        MutableIntObjectMap<MutableObjectList<Object>> mutableIntObjectMap = this.deferredSlotWrites;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 1;
        int i2 = 0;
        if (mutableIntObjectMap == null) {
            mutableIntObjectMap = new MutableIntObjectMap<>(i2, i, defaultConstructorMarker);
        }
        this.deferredSlotWrites = mutableIntObjectMap;
        int i3 = this.parent;
        MutableObjectList<Object> mutableObjectList = mutableIntObjectMap.get(i3);
        if (mutableObjectList == null) {
            mutableObjectList = new MutableObjectList<>(i2, i, defaultConstructorMarker);
            mutableIntObjectMap.set(i3, mutableObjectList);
        }
        mutableObjectList.add(value);
        return Composer.INSTANCE.getEmpty();
    }

    public final void updateAux(Object value) {
        int iGroupIndexToAddress = groupIndexToAddress(this.currentGroup);
        if (!((this.groups[(iGroupIndexToAddress * 5) + 1] & 268435456) != 0)) {
            ComposerKt.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        this.slots[dataIndexToDataAddress(auxIndex(this.groups, iGroupIndexToAddress))] = value;
    }

    public final void updateNode(Object value) {
        updateNodeOfGroup(this.currentGroup, value);
    }

    public final void updateToTableMaps() {
        this.sourceInformationMap = this.table.getSourceInformationMap$runtime();
        this.calledByMap = this.table.getCalledByMap$runtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int dataIndex(int[] iArr, int i) {
        return i >= getCapacity() ? this.slots.length - this.slotsGapLen : dataAnchorToDataIndex(iArr[(i * 5) + 4], this.slotsGapLen, this.slots.length);
    }

    private final int parent(int[] iArr, int i) {
        return parentAnchorToIndex(iArr[(groupIndexToAddress(i) * 5) + 2]);
    }

    public final Object slot(int groupIndex, int index) {
        int iSlotIndex = slotIndex(this.groups, groupIndexToAddress(groupIndex));
        int iDataIndex = dataIndex(this.groups, groupIndexToAddress(groupIndex + 1));
        int i = index + iSlotIndex;
        if (iSlotIndex > i || i >= iDataIndex) {
            return Composer.INSTANCE.getEmpty();
        }
        return this.slots[dataIndexToDataAddress(i)];
    }

    public final void updateNode(@NotNull Anchor anchor, Object value) {
        updateNodeOfGroup(anchor.toIndexFor(this), value);
    }

    public final boolean isNode(int index) {
        return (this.groups[(groupIndexToAddress(index) * 5) + 1] & 1073741824) != 0;
    }

    public final Object set(int group, int index, Object value) {
        int iDataIndexToDataAddress = dataIndexToDataAddress(slotIndexOfGroupSlotIndex(group, index));
        Object[] objArr = this.slots;
        Object obj2 = objArr[iDataIndexToDataAddress];
        objArr[iDataIndexToDataAddress] = value;
        return obj2;
    }

    public final void startGroup(int key, Object dataKey) {
        startGroup(key, dataKey, false, Composer.INSTANCE.getEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private final void startGroup(int key, Object objectKey, boolean isNode, Object aux) {
        int iGroupSize;
        int i = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if (objArr != false) {
            int i2 = this.currentGroup;
            int iDataIndex = dataIndex(this.groups, groupIndexToAddress(i2));
            insertGroups(1);
            this.currentSlot = iDataIndex;
            this.currentSlotEnd = iDataIndex;
            int iGroupIndexToAddress = groupIndexToAddress(i2);
            Composer.Companion companion = Composer.INSTANCE;
            ?? r122 = objectKey != companion.getEmpty() ? 1 : 0;
            ?? r132 = (isNode || aux == companion.getEmpty()) ? 0 : 1;
            int iDataIndexToDataAnchor = dataIndexToDataAnchor(iDataIndex, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (iDataIndexToDataAnchor >= 0 && this.slotsGapOwner < i2) {
                iDataIndexToDataAnchor = -(((this.slots.length - this.slotsGapLen) - iDataIndexToDataAnchor) + 1);
            }
            SlotTableKt.initGroup(this.groups, iGroupIndexToAddress, key, isNode, r122, r132, this.parent, iDataIndexToDataAnchor);
            int i3 = (isNode ? 1 : 0) + r122 + r132;
            if (i3 > 0) {
                insertSlots(i3, i2);
                Object[] objArr2 = this.slots;
                int i5 = this.currentSlot;
                if (isNode) {
                    objArr2[i5] = aux;
                    i5++;
                }
                if (r122 != 0) {
                    objArr2[i5] = objectKey;
                    i5++;
                }
                if (r132 != 0) {
                    objArr2[i5] = aux;
                    i5++;
                }
                this.currentSlot = i5;
            }
            this.nodeCount = 0;
            iGroupSize = i2 + 1;
            this.parent = i2;
            this.currentGroup = iGroupSize;
            if (i >= 0) {
                sourceInformationOf$runtime(i);
            }
        } else {
            this.startStack.push(i);
            saveCurrentGroupEnd();
            int i6 = this.currentGroup;
            int iGroupIndexToAddress2 = groupIndexToAddress(i6);
            if (!Intrinsics.f(aux, Composer.INSTANCE.getEmpty())) {
                if (isNode) {
                    updateNode(aux);
                } else {
                    updateAux(aux);
                }
            }
            this.currentSlot = slotIndex(this.groups, iGroupIndexToAddress2);
            this.currentSlotEnd = dataIndex(this.groups, groupIndexToAddress(this.currentGroup + 1));
            int[] iArr = this.groups;
            this.nodeCount = iArr[(iGroupIndexToAddress2 * 5) + 1] & 67108863;
            this.parent = i6;
            this.currentGroup = i6 + 1;
            iGroupSize = i6 + SlotTableKt.groupSize(iArr, iGroupIndexToAddress2);
        }
        this.currentGroupEnd = iGroupSize;
    }

    public final Object node(@NotNull Anchor anchor) {
        return node(anchor.toIndexFor(this));
    }

    public final void ensureStarted(@NotNull Anchor anchor) {
        ensureStarted(anchor.toIndexFor(this));
    }
}
