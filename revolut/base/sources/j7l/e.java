package j7l;

import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001c\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b_\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\"\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\"\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\"\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\"\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b-\u0010\u001d\u001a\u0004\b.\u0010\u001fR\"\u00101\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b\t\u0010\u001fR\"\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b2\u0010\u001d\u001a\u0004\b3\u0010\u001fR\"\u00107\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b5\u0010\u001d\u001a\u0004\b6\u0010\u001fR\"\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001088\u0016X\u0097\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\"\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b>\u0010\u001d\u001a\u0004\b?\u0010\u001fR(\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020B\u0018\u00010A8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b2\u0010ER(\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010A8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\"\u0010D\u001a\u0004\b!\u0010ER(\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010A8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010ER\u001c\u0010K\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\bH\u0010\u0004R\u001c\u0010N\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\bL\u0010\u0017\u001a\u0004\bM\u0010\u0019R\u001c\u0010Q\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\bP\u0010\u0004R\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\u0004R\u001c\u0010Y\u001a\u0004\u0018\u00010B8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001c\u0010\\\u001a\u0004\u0018\u00010B8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bZ\u0010V\u001a\u0004\b[\u0010XR\u001c\u0010^\u001a\u0004\u0018\u00010B8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b(\u0010V\u001a\u0004\b]\u0010XR\u001c\u0010a\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b_\u0010\u0017\u001a\u0004\b`\u0010\u0019R\u001c\u0010c\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\bb\u0010\u0017\u001a\u0004\b*\u0010\u0019R\u001c\u0010f\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\bd\u0010\u0017\u001a\u0004\be\u0010\u0019R\u001c\u0010i\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\bg\u0010\u0017\u001a\u0004\bh\u0010\u0019R\u001c\u0010l\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bk\u0010\u0004R\"\u0010n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\bm\u0010\u001fR\u001c\u0010q\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\bo\u0010\u0006\u001a\u0004\bp\u0010\u0004R\u001c\u0010t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\br\u0010\u0006\u001a\u0004\bs\u0010\u0004R\"\u0010w\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bu\u0010\u001d\u001a\u0004\bv\u0010\u001fR\"\u0010z\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bx\u0010\u001d\u001a\u0004\by\u0010\u001fR\"\u0010|\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b{\u0010\u001d\u001a\u0004\bC\u0010\u001fR\"\u0010}\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\be\u0010\u001d\u001a\u0004\bL\u0010\u001fR#\u0010\u0080\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b~\u0010\u001d\u001a\u0004\b\u007f\u0010\u001fR$\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b\u0081\u0001\u0010\u001d\u001a\u0004\bd\u0010\u001fR#\u0010\u0083\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b3\u0010\u001d\u001a\u0004\bx\u0010\u001fR$\u0010\u0085\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b\u0084\u0001\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR+\u0010\u0088\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010A8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010D\u001a\u0005\b\u0087\u0001\u0010ER$\u0010\u008a\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\r\n\u0004\bI\u0010\u001d\u001a\u0005\b\u0089\u0001\u0010\u001fR\u001f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0011\u001a\u0005\b\u008c\u0001\u0010\u0013R$\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b\u0087\u0001\u0010\u001d\u001a\u0004\b-\u0010\u001fR%\u0010\u0091\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u001d\u001a\u0005\b\u0090\u0001\u0010\u001fR\u001f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010\u0017\u001a\u0005\b\u0093\u0001\u0010\u0019R\u001f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0017\u001a\u0005\b\u0096\u0001\u0010\u0019R$\u0010\u0099\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b\u0098\u0001\u0010\u001d\u001a\u0004\b\f\u0010\u001fR\u001f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\u0006\u001a\u0005\b\u009a\u0001\u0010\u0004R\u001d\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\b~\u0010\u0004R%\u0010\u009e\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u001d\u001a\u0005\b\u009d\u0001\u0010\u001fR\u001f\u0010¡\u0001\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0006\u001a\u0005\b \u0001\u0010\u0004R!\u0010¦\u0001\u001a\u0005\u0018\u00010¢\u00018\u0016X\u0097\u0004¢\u0006\u000f\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0005\bb\u0010¥\u0001R\u001f\u0010¨\u0001\u001a\u0004\u0018\u00010B8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b§\u0001\u0010V\u001a\u0005\b\u008f\u0001\u0010XR%\u0010«\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b©\u0001\u0010\u001d\u001a\u0005\bª\u0001\u0010\u001fR&\u0010¯\u0001\u001a\u000b\u0012\u0005\u0012\u00030¬\u0001\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\u001d\u001a\u0005\b®\u0001\u0010\u001fR#\u0010°\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b0\u0010\u001fR$\u0010²\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\r\n\u0004\bh\u0010\u001d\u001a\u0005\b±\u0001\u0010\u001fR$\u0010³\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\r\n\u0004\bs\u0010\u001d\u001a\u0005\b\u0084\u0001\u0010\u001fR%\u0010¶\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b´\u0001\u0010\u001d\u001a\u0005\bµ\u0001\u0010\u001fR\u001e\u0010·\u0001\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b±\u0001\u0010\u0011\u001a\u0004\b$\u0010\u0013R\u001e\u0010¸\u0001\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\r\n\u0004\bk\u0010\u0017\u001a\u0005\b\u0086\u0001\u0010\u0019R\u001d\u0010¹\u0001\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\bg\u0010\u0019R\u001e\u0010»\u0001\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\r\n\u0004\bW\u0010\u0011\u001a\u0005\bº\u0001\u0010\u0013R\u001f\u0010¾\u0001\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b¼\u0001\u0010\u0011\u001a\u0005\b½\u0001\u0010\u0013R1\u0010À\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b\u0018\u00010A8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b¿\u0001\u0010D\u001a\u0005\b´\u0001\u0010ER\"\u0010Å\u0001\u001a\u0005\u0018\u00010Á\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bÂ\u0001\u0010Ã\u0001\u001a\u0006\b\u009f\u0001\u0010Ä\u0001R!\u0010Ç\u0001\u001a\u0005\u0018\u00010Á\u00018\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b?\u0010Ã\u0001\u001a\u0006\bÆ\u0001\u0010Ä\u0001R\u001e\u0010É\u0001\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\r\n\u0005\bÈ\u0001\u0010\u0011\u001a\u0004\bj\u0010\u0013R!\u0010Í\u0001\u001a\u0005\u0018\u00010Ê\u00018\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b\u0007\u0010Ë\u0001\u001a\u0006\b\u0092\u0001\u0010Ì\u0001R\u001e\u0010Ï\u0001\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\r\n\u0005\bÎ\u0001\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001e\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\n\u0010\u0011\u001a\u0005\bÐ\u0001\u0010\u0013R\"\u0010Ó\u0001\u001a\u0005\u0018\u00010Á\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ã\u0001\u001a\u0006\bÒ\u0001\u0010Ä\u0001R\u001f\u0010Ö\u0001\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÔ\u0001\u0010\u0011\u001a\u0005\bÕ\u0001\u0010\u0013R\u001d\u0010×\u0001\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b[\u0010\u0011\u001a\u0004\bo\u0010\u0013R\u001e\u0010Ù\u0001\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\r\n\u0004\by\u0010\u0006\u001a\u0005\bØ\u0001\u0010\u0004R\u001e\u0010Û\u0001\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\r\n\u0005\bÚ\u0001\u0010\u0011\u001a\u0004\b_\u0010\u0013R\u001d\u0010Ü\u0001\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\bZ\u0010\u0004R\u001f\u0010Þ\u0001\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÐ\u0001\u0010\u0006\u001a\u0005\bÝ\u0001\u0010\u0004R#\u0010ß\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bª\u0001\u0010\u001d\u001a\u0005\b\u008b\u0001\u0010\u001fR%\u0010à\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010\u001d\u001a\u0005\b©\u0001\u0010\u001fR#\u0010á\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b9\u0010\u001fR#\u0010â\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u007f\u0010\u001d\u001a\u0004\b>\u0010\u001fR\u001e\u0010ä\u0001\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\r\n\u0005\bã\u0001\u0010\u0006\u001a\u0004\bO\u0010\u0004R#\u0010å\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bv\u0010\u001d\u001a\u0004\b{\u0010\u001fR*\u0010æ\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010A8\u0016X\u0097\u0004¢\u0006\r\n\u0004\b.\u0010D\u001a\u0005\b\u0098\u0001\u0010ER\u001f\u0010ç\u0001\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÒ\u0001\u0010\u0011\u001a\u0005\bÎ\u0001\u0010\u0013R \u0010è\u0001\u001a\u0005\u0018\u00010Á\u00018\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b+\u0010Ã\u0001\u001a\u0005\b\u0016\u0010Ä\u0001R\"\u0010ë\u0001\u001a\u0005\u0018\u00010Á\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bé\u0001\u0010Ã\u0001\u001a\u0006\bê\u0001\u0010Ä\u0001R&\u0010ï\u0001\u001a\u000b\u0012\u0005\u0012\u00030ì\u0001\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bí\u0001\u0010\u001d\u001a\u0005\bî\u0001\u0010\u001fR%\u0010ò\u0001\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bð\u0001\u0010\u001d\u001a\u0005\bñ\u0001\u0010\u001fR\"\u0010ö\u0001\u001a\u0005\u0018\u00010ó\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bê\u0001\u0010ô\u0001\u001a\u0006\b§\u0001\u0010õ\u0001R\u001f\u0010ø\u0001\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b÷\u0001\u0010\u0011\u001a\u0005\b\u00ad\u0001\u0010\u0013R \u0010ü\u0001\u001a\u0005\u0018\u00010ù\u00018\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010ú\u0001\u001a\u0005\b'\u0010û\u0001R\"\u0010ÿ\u0001\u001a\u0005\u0018\u00010Á\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bý\u0001\u0010Ã\u0001\u001a\u0006\bþ\u0001\u0010Ä\u0001R \u0010\u0083\u0002\u001a\u0005\u0018\u00010\u0080\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bS\u0010\u0081\u0002\u001a\u0005\b\u0005\u0010\u0082\u0002R$\u0010\u0085\u0002\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b\u0084\u0002\u0010\u001d\u001a\u0004\br\u0010\u001fR*\u0010\u0086\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010A8\u0016X\u0097\u0004¢\u0006\r\n\u0004\bp\u0010D\u001a\u0005\b\u0081\u0001\u0010ER\"\u0010\u0088\u0002\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0097\u0004¢\u0006\r\n\u0004\bm\u0010\u001d\u001a\u0005\b\u0087\u0002\u0010\u001fR\"\u0010\u0089\u0002\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b \u0001\u0010\u001d\u001a\u0004\bR\u0010\u001fR\"\u0010\u008a\u0002\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b\u0090\u0001\u0010\u001d\u001a\u0004\b5\u0010\u001fR\u001f\u0010\u008b\u0002\u001a\u0004\u0018\u00010B8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bþ\u0001\u0010V\u001a\u0005\bé\u0001\u0010XR%\u0010\u008d\u0002\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b®\u0001\u0010\u001d\u001a\u0005\b\u008c\u0002\u0010\u001fR\u001e\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\r\n\u0004\b`\u0010\u0017\u001a\u0005\bÚ\u0001\u0010\u0019R\u001f\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0087\u0002\u0010\u0011\u001a\u0005\b\u008f\u0002\u0010\u0013R\u001f\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0011\u001a\u0005\bÔ\u0001\u0010\u0013R\u001f\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bØ\u0001\u0010\u0011\u001a\u0005\b£\u0001\u0010\u0013R%\u0010\u0094\u0002\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0093\u0002\u0010\u001d\u001a\u0005\bí\u0001\u0010\u001fR\u001f\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u008f\u0002\u0010\u0011\u001a\u0005\b÷\u0001\u0010\u0013R1\u0010\u0097\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b\u0018\u00010A8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010D\u001a\u0005\b\u0096\u0002\u0010ER\"\u0010\u009c\u0002\u001a\u0005\u0018\u00010\u0098\u00028\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010\u0099\u0002\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R%\u0010\u009d\u0002\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÝ\u0001\u0010\u001d\u001a\u0005\bÈ\u0001\u0010\u001fR!\u0010¡\u0002\u001a\u0005\u0018\u00010\u009e\u00028\u0016X\u0097\u0004¢\u0006\u000f\n\u0006\bÕ\u0001\u0010\u009f\u0002\u001a\u0005\bU\u0010 \u0002R\u001f\u0010£\u0002\u001a\u0004\u0018\u00010B8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u008c\u0002\u0010V\u001a\u0005\b¢\u0002\u0010XR1\u0010¤\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001b\u0018\u00010A8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b½\u0001\u0010D\u001a\u0005\bð\u0001\u0010ER$\u0010¥\u0002\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\r\n\u0004\b;\u0010\u001d\u001a\u0005\bã\u0001\u0010\u001fR\u001f\u0010¦\u0002\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b¢\u0002\u0010\u0006\u001a\u0005\b¼\u0001\u0010\u0004R\u001f\u0010§\u0002\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bñ\u0001\u0010\u0011\u001a\u0005\b\u0093\u0002\u0010\u0013R%\u0010¨\u0002\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0096\u0002\u0010\u001d\u001a\u0005\b\u0084\u0002\u0010\u001fR\u001f\u0010ª\u0002\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b©\u0002\u0010\u0011\u001a\u0005\bÂ\u0001\u0010\u0013R\u001e\u0010«\u0002\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\r\n\u0004\bM\u0010\u0011\u001a\u0005\bý\u0001\u0010\u0013R\u001e\u0010¬\u0002\u001a\u0004\u0018\u00010\u000f8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b\u009a\u0001\u0010\u0011\u001a\u0004\bu\u0010\u0013R%\u0010\u00ad\u0002\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bî\u0001\u0010\u001d\u001a\u0005\b¿\u0001\u0010\u001fR%\u0010®\u0002\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u009a\u0002\u0010\u001d\u001a\u0005\b\u0095\u0001\u0010\u001fR%\u0010°\u0002\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b¯\u0002\u0010\u001d\u001a\u0005\b©\u0002\u0010\u001f¨\u0006±\u0002"}, d2 = {"Lj7l/e;", "Lj7l/c;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "t0", "securitySigninLockoutMinutes", "b", "v0", "securitySigninMaxAttempts", "c", "g0", "merchantIconsUrl", "", "d", "Ljava/lang/Boolean;", "R0", "()Ljava/lang/Boolean;", "googlePayEnableNormalCards", "", "e", "Ljava/lang/Long;", "F", "()Ljava/lang/Long;", "cashbackVaultsRemovalDate", "", "f", "Ljava/util/List;", "F0", "()Ljava/util/List;", "countriesBlacklisted", "g", "r", "countriesSupported", "h", "m0", "countriesWaitingList", "i", "z", "countriesWithoutZip", "j", "L0", "countriesBuab", "k", "J0", "countriesPhoneCodes", "l", "countriesNationalitiesSupported", "m", "O", "postcodeSearchCountries", "n", "t", "addressSearchCountries", "", "o", "Ljava/util/Set;", "n1", "()Ljava/util/Set;", "addressNumberRequiredCountries", "p", "r0", "countriesWithDigitalPostcode", "", "", "q", "Ljava/util/Map;", "()Ljava/util/Map;", "maxActiveCardsCountMap", "topupMinAmount", "s", "R", "topupDefaultAmount", "legalFeesUrl", "u", "s1", "cardMaxMonthlyUsageLimit", "v", "Z", "loanManageCreditsUrl", "w", "T0", "loanPrivacyPolicyUrl", "x", "Ljava/lang/Integer;", "n0", "()Ljava/lang/Integer;", "loanTermMin", "y", "y0", "loanTermMax", "B0", "loanTermDefault", "A", "b1", "loanAmountMin", "B", "loanAmountMax", "C", "L", "loanAmountDefault", "D", "h0", "loanIntervalAmount", "E", "l0", "loanBaseCurrency", "W0", "loanCountriesSupported", "G", "V0", "newsIconsUrl", "H", "i0", "cardDesignsUrl", "I", "I0", "walletCurrencies", "J", "z0", "walletExtraFxCurrencies", "K", "cashbackCurrencies", "walletProhibitedCurrencies", "M", "G0", "topupCardCurrencies", "N", "topupBankTransferCurrencies", "topupGooglePayCurrencies", "P", "topupDirectDebitCurrencies", "Q", "T", "topupSofortCreditLimits", "h1", "topupSofortCountries", "S", "E0", "topupIdealEnabled", "topupIdealAvailableCountries", "U", "Y0", "topupIdealSupportedCurrencies", "V", "a0", "topupIdealMinTopUpAmount", "W", "Y", "topupIdealMaxTopUpAmount", "X", "paymentLinkBlacklistCountries", "t1", "tradingCommoditiesProvidedBy", "tradingCommoditiesTermsOfBusinessUrl", "d1", "externalContactsBlacklistCountries", "b0", "X0", "appVersion", "Ljava/time/Instant;", "c0", "Ljava/time/Instant;", "()Ljava/time/Instant;", "appVersionExpiry", "d0", "cardDesignsVersion", "e0", "D0", "noRegionCountries", "Lj7l/l;", "f0", "a1", "supportContactUsItems", "appPopularCountries", "k0", "outOfStockCardCodes", "freeToResideCountries", "j0", "getKycDocumentsNotId", "kycDocumentsNotId", "cardDeliveryForcedHomeAddress", "transactionFetchThrottlePeriodSeconds", "transactionsDatabaseTimeoutMs", "i1", "allowFirstVirtualCardForFree", "o0", "m1", "disableViewPin", "p0", "peerToPeerCountryCurrenciesMap", "Ljo3/a;", "q0", "Ljo3/a;", "()Ljo3/a;", "cardScaContactlessDeclineLimit", "w0", "cardScaContactlessNotifyLimit", "s0", "cardPromptEnabled", "Lj7l/b;", "Lj7l/b;", "()Lj7l/b;", "cardCustomisationCompetitionConfig", "u0", "showInsuranceIntermediationText", "C0", "isInsuranceHomeWidgetAvailable", "K0", "transferMaxAmount", "x0", "k1", "dashboardPocketsWidgetVisibleByDefault", "comparePlansEntryPointAvailable", "e1", "topupOpenBankingDefaultMethod", "A0", "usSsnOptional", "openBankingAuthFlow", "j1", "giftingScheduledGiftSendTime", "openBankingIbanCountries", "liteAppCountries", "cardTransferEligibleCountries", "customisationUnsupportedCountries", "H0", "exchangeDefaultCurrencyCode", "prepaidCardsCountries", "maxMonthlyLimitForCurrencies", "isCaptchaEnabled", "defaultMandateLimitPerTransfer", "M0", "P0", "mandateUpperLimit", "Lj7l/f;", "N0", "u1", "previewCurrencies", "O0", "p1", "cryptoAppCountries", "Lj7l/g;", "Lj7l/g;", "()Lj7l/g;", "detectedLocation", "Q0", "customOnboardingStoriesEnabled", "Lj7l/j;", "Lj7l/j;", "()Lj7l/j;", "customOnboardingIntro", "S0", "Z0", "euCashTopupLimit", "Lj7l/h;", "Lj7l/h;", "()Lj7l/h;", "euCashProcessorInfo", "U0", "p2pChatWelcomeStickers", "p2pMinimumAmounts", "c1", "countriesOnlyLocalPhoneNumberSupported", "onlyCitizensSupportedCountries", "countriesKnownMunicipalities", "referralCodeInProfileMaxEnabledDays", "l1", "atmPinChangeUnsupportedCountries", "deviceCooldownSeconds", "g1", "autoBindReferralCodesEnabled", "referralCodesEnabled", "referralAppClipEnabled", "f1", "referralsChatSupportedCountries", "isPreChangeWarningEnabled", "q1", "restrictedDeliveryPostcodes", "Lj7l/k;", "Lj7l/k;", "v1", "()Lj7l/k;", "savingsConfig", "nonExchangeableCurrencies", "Lj7l/a;", "Lj7l/a;", "()Lj7l/a;", "bizumConfig", "o1", "topupCardsNumberLimit", "allowedCountriesForCurrency", "countriesWithSelectableCity", "onboardingConsolidatedAuth", "onboardingKompot", "commodityTradesProhibitedCurrencies", "r1", "numberlessCardToggleState", "onboardingRevolut10Refresh", "userIsCobranded", "countriesWithAddressCitySearch", "countriesWithAddressRegionSearch", "w1", "transferLinkCurrencies", "feature_shared_configuration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e implements c {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("loan.amount.min")
    private final Long loanAmountMin;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    @lg.b("us.ssn.optional")
    private final Boolean usSsnOptional;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("loan.amount.max")
    private final Long loanAmountMax;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    @lg.b("openBanking.authFlow")
    private final String openBankingAuthFlow;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("loan.amount.default")
    private final Long loanAmountDefault;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    @lg.b("gifting.scheduled.gift.send.time")
    private final String giftingScheduledGiftSendTime;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("loan.interval.amount")
    private final Long loanIntervalAmount;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    @lg.b("topup.ob_remitter_iban.countries")
    @NotNull
    private final List<String> openBankingIbanCountries;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("loan.base_currency")
    private final String loanBaseCurrency;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @lg.b("lite_app.countries.supported")
    private final List<String> liteAppCountries;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("loan.countries.supported")
    private final List<String> loanCountriesSupported;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @lg.b("transfer.card.eligible_countries")
    private final List<String> cardTransferEligibleCountries;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("news_icons.url")
    private final String newsIconsUrl;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @lg.b("card.customisationUnsupportedCountries")
    private final List<String> customisationUnsupportedCountries;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("card_designs.url")
    private final String cardDesignsUrl;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @lg.b("exchange.default_currency")
    private final String exchangeDefaultCurrencyCode;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @lg.b("wallet.currencies")
    private final List<String> walletCurrencies;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @lg.b("card.prepaidCountries")
    private final List<String> prepaidCardsCountries;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @lg.b("wallet.extra_fx_currencies")
    private final List<String> walletExtraFxCurrencies;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @lg.b("card.maxMonthlyLimitForCurrencies")
    private final Map<String, Long> maxMonthlyLimitForCurrencies;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @lg.b("wallet.cashback.currencies")
    private final List<String> cashbackCurrencies;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @lg.b("user_auth.captcha.enabled")
    private final Boolean isCaptchaEnabled;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @lg.b("wallet.payments_prohibited_currencies")
    private final List<String> walletProhibitedCurrencies;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @lg.b("mandate.default.individualLimit")
    private final jo3.a defaultMandateLimitPerTransfer;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @lg.b("topup.card.currencies")
    private final List<String> topupCardCurrencies;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @lg.b("mandate.upperLimit")
    private final jo3.a mandateUpperLimit;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @lg.b("topup.bankTransfer.currencies")
    private final List<String> topupBankTransferCurrencies;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @lg.b("preview_currencies")
    private final List<f> previewCurrencies;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @lg.b("topup.googlePay.currencies")
    private final List<String> topupGooglePayCurrencies;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @lg.b("lite_app.countries.crypto_balance")
    private final List<String> cryptoAppCountries;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @lg.b("topup.directDebit.currencies")
    private final List<String> topupDirectDebitCurrencies;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @lg.b("detected_location")
    private final g detectedLocation;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @lg.b("topup.sofort.credit.limit")
    private final Map<String, Long> topupSofortCreditLimits;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @lg.b("custom.onboarding.stories.enabled")
    private final Boolean customOnboardingStoriesEnabled;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @lg.b("topup.sofort.countries.supported")
    private final List<String> topupSofortCountries;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @lg.b("custom.onboarding.intro")
    private final j customOnboardingIntro;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @lg.b("topup.ideal.enabled")
    private final Boolean topupIdealEnabled;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @lg.b("cash_eu.topup.limit")
    private final jo3.a euCashTopupLimit;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @lg.b("topup.ideal.supported_countries")
    private final List<String> topupIdealAvailableCountries;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @lg.b("topup.viafintech.processor")
    private final h euCashProcessorInfo;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @lg.b("topup.ideal.supported_currencies")
    private final List<String> topupIdealSupportedCurrencies;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @lg.b("social.chat.welcome_stickers")
    private final List<String> p2pChatWelcomeStickers;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @lg.b("topup.ideal.min_topup_amount")
    private final Long topupIdealMinTopUpAmount;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @lg.b("transfer.p2p.minimum_amounts")
    private final Map<String, Long> p2pMinimumAmounts;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @lg.b("topup.ideal.max_topup_amount")
    private final Long topupIdealMaxTopUpAmount;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    @lg.b("countries.only_local_phone_number_supported")
    @NotNull
    private final List<String> countriesOnlyLocalPhoneNumberSupported;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @lg.b("topup.paymentLink.blacklistedCountries")
    private final List<String> paymentLinkBlacklistCountries;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    @lg.b("countries.only_citizens_supported")
    @NotNull
    private final List<String> onlyCitizensSupportedCountries;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @lg.b("trading.commodities.provided_by")
    private final String tradingCommoditiesProvidedBy;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    @lg.b("countries.known_municipalities")
    @NotNull
    private final List<String> countriesKnownMunicipalities;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @lg.b("trading.commodities.terms_of_business_url")
    private final String tradingCommoditiesTermsOfBusinessUrl;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    @lg.b("referrals.referral_code.profile.max_enabled_days")
    private final Integer referralCodeInProfileMaxEnabledDays;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("security.signin.lockout_minutes")
    private final String securitySigninLockoutMinutes;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @lg.b("payments.contacts.external.blacklistedCountries")
    private final List<String> externalContactsBlacklistCountries;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    @lg.b("card.atmPinChangeUnsupportedCountries")
    private final List<String> atmPinChangeUnsupportedCountries;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("security.signin.max_attempts")
    private final String securitySigninMaxAttempts;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @lg.b("app.version")
    private final String appVersion;

    /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
    @lg.b("security.device.cooldown")
    private final Long deviceCooldownSeconds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchant_icons.url")
    private final String merchantIconsUrl;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    @lg.b("app.version.expiry")
    private final Instant appVersionExpiry;

    /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
    @lg.b("referrals.auto_bind_referral_codes.enabled")
    private final Boolean autoBindReferralCodesEnabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("google_pay.enable_normal_cards")
    private final Boolean googlePayEnableNormalCards;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @lg.b("card_designs.version")
    private final Integer cardDesignsVersion;

    /* JADX INFO: renamed from: d1, reason: collision with root package name and from kotlin metadata */
    @lg.b("referrals.referral_codes.enabled")
    private final Boolean referralCodesEnabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cashback.vaults_removal_date")
    private final Long cashbackVaultsRemovalDate;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    @lg.b("app.noregionfield.countries")
    private final List<String> noRegionCountries;

    /* JADX INFO: renamed from: e1, reason: collision with root package name and from kotlin metadata */
    @lg.b("referrals.referral_app_clip.enabled")
    private final Boolean referralAppClipEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("countries.blacklisted")
    private final List<String> countriesBlacklisted;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    @lg.b("support.contact-us")
    private final List<l> supportContactUsItems;

    /* JADX INFO: renamed from: f1, reason: collision with root package name and from kotlin metadata */
    @lg.b("referrals.chat.supported_countries")
    private final List<String> referralsChatSupportedCountries;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("countries.supported")
    private final List<String> countriesSupported;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    @lg.b("app.popular_in_countries")
    private final List<String> appPopularCountries;

    /* JADX INFO: renamed from: g1, reason: collision with root package name and from kotlin metadata */
    @lg.b("security.warnings.pre_high_risk_activity")
    private final Boolean isPreChangeWarningEnabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("countries.waiting_list")
    private final List<String> countriesWaitingList;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    @lg.b("card.out_of_stock_designs")
    private final List<String> outOfStockCardCodes;

    /* JADX INFO: renamed from: h1, reason: collision with root package name and from kotlin metadata */
    @lg.b("address.delivery.postcode.restricted")
    private final Map<String, List<String>> restrictedDeliveryPostcodes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("countries.without-zip")
    private final List<String> countriesWithoutZip;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    @lg.b("kyc.countries.free_to_reside")
    private final List<String> freeToResideCountries;

    /* JADX INFO: renamed from: i1, reason: collision with root package name and from kotlin metadata */
    @lg.b("savings")
    private final k savingsConfig;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("countries.buab")
    private final List<String> countriesBuab;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    @lg.b("kyc.documents.unsupported")
    private final List<String> kycDocumentsNotId;

    /* JADX INFO: renamed from: j1, reason: collision with root package name and from kotlin metadata */
    @lg.b("transfer.no_exchange_allowed_currencies")
    private final List<String> nonExchangeableCurrencies;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("countries.phone_codes")
    private final List<String> countriesPhoneCodes;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @lg.b("kyc.forced_home_delivery")
    private final Boolean cardDeliveryForcedHomeAddress;

    /* JADX INFO: renamed from: k1, reason: collision with root package name and from kotlin metadata */
    @lg.b("bizum")
    private final a bizumConfig;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("countries.nationalities.supported")
    private final List<String> countriesNationalitiesSupported;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    @lg.b("transactions.max_fetch_period.seconds")
    private final Long transactionFetchThrottlePeriodSeconds;

    /* JADX INFO: renamed from: l1, reason: collision with root package name and from kotlin metadata */
    @lg.b("topup.card.active_limit")
    private final Integer topupCardsNumberLimit;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("address.postcodeLookup.countries")
    private final List<String> postcodeSearchCountries;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    @lg.b("transactions.database.timeout.milliseconds")
    private final Long transactionsDatabaseTimeoutMs;

    /* JADX INFO: renamed from: m1, reason: from kotlin metadata */
    @lg.b("wallet.allowed_countries_for_currency")
    private final Map<String, List<String>> allowedCountriesForCurrency;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("address.autoCompletion.countries")
    private final List<String> addressSearchCountries;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @lg.b("card.allow_first_virtual_for_free")
    private final Boolean allowFirstVirtualCardForFree;

    /* JADX INFO: renamed from: n1, reason: collision with root package name and from kotlin metadata */
    @lg.b("address.city.predefined_list.countries")
    private final List<String> countriesWithSelectableCity;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("address.house_number_required_countries")
    private final Set<String> addressNumberRequiredCountries;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @lg.b("pin.disable_view_pin")
    private final Boolean disableViewPin;

    /* JADX INFO: renamed from: o1, reason: collision with root package name and from kotlin metadata */
    @lg.b("experiment.onboarding.consolidated_auth")
    private final String onboardingConsolidatedAuth;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("address.postcode.only_numbers.countries")
    private final List<String> countriesWithDigitalPostcode;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    @lg.b("p2p.currencies")
    private final Map<String, List<String>> peerToPeerCountryCurrenciesMap;

    /* JADX INFO: renamed from: p1, reason: collision with root package name and from kotlin metadata */
    @lg.b("experiment.onboarding.kompot")
    private final Boolean onboardingKompot;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("card.max_active_count")
    private final Map<String, Integer> maxActiveCardsCountMap;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    @lg.b("sca.counters.decline_limit")
    private final jo3.a cardScaContactlessDeclineLimit;

    /* JADX INFO: renamed from: q1, reason: from kotlin metadata */
    @lg.b("wallet.commodity_trades_prohibited_currencies")
    private final List<String> commodityTradesProhibitedCurrencies;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("topup.min_amount")
    private final Map<String, Long> topupMinAmount;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @lg.b("sca.counters.notify_limit")
    private final jo3.a cardScaContactlessNotifyLimit;

    /* JADX INFO: renamed from: r1, reason: collision with root package name and from kotlin metadata */
    @lg.b("card.numberless.toggle.default")
    private final Boolean numberlessCardToggleState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("topup.default_amount")
    private final Map<String, Long> topupDefaultAmount;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @lg.b("card.prompt.enabled")
    private final Boolean cardPromptEnabled;

    /* JADX INFO: renamed from: s1, reason: collision with root package name and from kotlin metadata */
    @lg.b("onboarding.revolut10Refresh")
    private final Boolean onboardingRevolut10Refresh;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("terms.legalfees.url")
    private final String legalFeesUrl;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @lg.b("card.customisation_competition")
    private final b cardCustomisationCompetitionConfig;

    /* JADX INFO: renamed from: t1, reason: collision with root package name and from kotlin metadata */
    @lg.b("cobrands.isCobranded")
    private final Boolean userIsCobranded;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("card.max_monthly_usage_limit")
    private final Long cardMaxMonthlyUsageLimit;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    @lg.b("insurance.show_intermediation_text")
    private final Boolean showInsuranceIntermediationText;

    /* JADX INFO: renamed from: u1, reason: collision with root package name and from kotlin metadata */
    @lg.b("address.search.city.countries")
    private final List<String> countriesWithAddressCitySearch;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("loan.manage_credits.url")
    private final String loanManageCreditsUrl;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    @lg.b("insurance.is_home_widget_available")
    private final Boolean isInsuranceHomeWidgetAvailable;

    /* JADX INFO: renamed from: v1, reason: collision with root package name and from kotlin metadata */
    @lg.b("address.search.region.countries")
    private final List<String> countriesWithAddressRegionSearch;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("loan.privacy_policy.url")
    private final String loanPrivacyPolicyUrl;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @lg.b("transfer.amount.cap")
    private final jo3.a transferMaxAmount;

    /* JADX INFO: renamed from: w1, reason: from kotlin metadata */
    @lg.b("transfer_link.currencies")
    private final List<String> transferLinkCurrencies;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("loan.term.min")
    private final Integer loanTermMin;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @lg.b("dashboard.accounts.visible_by_default")
    private final Boolean dashboardPocketsWidgetVisibleByDefault;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("loan.term.max")
    private final Integer loanTermMax;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    @lg.b("experiment.compare_plans.entry_point_availability")
    private final Boolean comparePlansEntryPointAvailable;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("loan.term.default")
    private final Integer loanTermDefault;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    @lg.b("topup.default_method")
    private final String topupOpenBankingDefaultMethod;

    public e() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, Integer.MAX_VALUE);
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: A, reason: from getter */
    public final Boolean getUsSsnOptional() {
        return this.usSsnOptional;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final Long getDeviceCooldownSeconds() {
        return this.deviceCooldownSeconds;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: B, reason: from getter */
    public final Instant getAppVersionExpiry() {
        return this.appVersionExpiry;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: B0, reason: from getter */
    public final Integer getLoanTermDefault() {
        return this.loanTermDefault;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: C, reason: from getter */
    public final List getTopupBankTransferCurrencies() {
        return this.topupBankTransferCurrencies;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: C0, reason: from getter */
    public final Boolean getIsInsuranceHomeWidgetAvailable() {
        return this.isInsuranceHomeWidgetAvailable;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: D, reason: from getter */
    public final Long getTransactionsDatabaseTimeoutMs() {
        return this.transactionsDatabaseTimeoutMs;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: D0, reason: from getter */
    public final List getNoRegionCountries() {
        return this.noRegionCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: E, reason: from getter */
    public final Boolean getCardPromptEnabled() {
        return this.cardPromptEnabled;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: E0, reason: from getter */
    public final Boolean getTopupIdealEnabled() {
        return this.topupIdealEnabled;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: F, reason: from getter */
    public final Long getCashbackVaultsRemovalDate() {
        return this.cashbackVaultsRemovalDate;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: F0, reason: from getter */
    public final List getCountriesBlacklisted() {
        return this.countriesBlacklisted;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: G, reason: from getter */
    public final Boolean getComparePlansEntryPointAvailable() {
        return this.comparePlansEntryPointAvailable;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final List getTopupCardCurrencies() {
        return this.topupCardCurrencies;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: H, reason: from getter */
    public final List getP2pChatWelcomeStickers() {
        return this.p2pChatWelcomeStickers;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final List getCountriesWithSelectableCity() {
        return this.countriesWithSelectableCity;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: I, reason: from getter */
    public final Boolean getUserIsCobranded() {
        return this.userIsCobranded;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: I0, reason: from getter */
    public final List getWalletCurrencies() {
        return this.walletCurrencies;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: J, reason: from getter */
    public final List getTopupGooglePayCurrencies() {
        return this.topupGooglePayCurrencies;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final List getCountriesPhoneCodes() {
        return this.countriesPhoneCodes;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: K, reason: from getter */
    public final List getPrepaidCardsCountries() {
        return this.prepaidCardsCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: K0, reason: from getter */
    public final jo3.a getTransferMaxAmount() {
        return this.transferMaxAmount;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: L, reason: from getter */
    public final Long getLoanAmountDefault() {
        return this.loanAmountDefault;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: L0, reason: from getter */
    public final List getCountriesBuab() {
        return this.countriesBuab;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: M, reason: from getter */
    public final String getTradingCommoditiesTermsOfBusinessUrl() {
        return this.tradingCommoditiesTermsOfBusinessUrl;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: M0, reason: from getter */
    public final Integer getReferralCodeInProfileMaxEnabledDays() {
        return this.referralCodeInProfileMaxEnabledDays;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: N, reason: from getter */
    public final Map getP2pMinimumAmounts() {
        return this.p2pMinimumAmounts;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: N0, reason: from getter */
    public final List getReferralsChatSupportedCountries() {
        return this.referralsChatSupportedCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: O, reason: from getter */
    public final List getPostcodeSearchCountries() {
        return this.postcodeSearchCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final Map getAllowedCountriesForCurrency() {
        return this.allowedCountriesForCurrency;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: P, reason: from getter */
    public final List getFreeToResideCountries() {
        return this.freeToResideCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: P0, reason: from getter */
    public final jo3.a getMandateUpperLimit() {
        return this.mandateUpperLimit;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final Long getTransactionFetchThrottlePeriodSeconds() {
        return this.transactionFetchThrottlePeriodSeconds;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: Q0, reason: from getter */
    public final Boolean getIsPreChangeWarningEnabled() {
        return this.isPreChangeWarningEnabled;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: R, reason: from getter */
    public final Map getTopupDefaultAmount() {
        return this.topupDefaultAmount;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: R0, reason: from getter */
    public final Boolean getGooglePayEnableNormalCards() {
        return this.googlePayEnableNormalCards;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: S, reason: from getter */
    public final List getOpenBankingIbanCountries() {
        return this.openBankingIbanCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: S0, reason: from getter */
    public final Boolean getOnboardingRevolut10Refresh() {
        return this.onboardingRevolut10Refresh;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: T, reason: from getter */
    public final Map getTopupSofortCreditLimits() {
        return this.topupSofortCreditLimits;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: T0, reason: from getter */
    public final String getLoanPrivacyPolicyUrl() {
        return this.loanPrivacyPolicyUrl;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: U, reason: from getter */
    public final Integer getCardDesignsVersion() {
        return this.cardDesignsVersion;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: U0, reason: from getter */
    public final List getCommodityTradesProhibitedCurrencies() {
        return this.commodityTradesProhibitedCurrencies;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: V, reason: from getter */
    public final b getCardCustomisationCompetitionConfig() {
        return this.cardCustomisationCompetitionConfig;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: V0, reason: from getter */
    public final String getNewsIconsUrl() {
        return this.newsIconsUrl;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: W, reason: from getter */
    public final List getCountriesWithAddressRegionSearch() {
        return this.countriesWithAddressRegionSearch;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: W0, reason: from getter */
    public final List getLoanCountriesSupported() {
        return this.loanCountriesSupported;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: X, reason: from getter */
    public final Map getMaxMonthlyLimitForCurrencies() {
        return this.maxMonthlyLimitForCurrencies;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: X0, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: Y, reason: from getter */
    public final Long getTopupIdealMaxTopUpAmount() {
        return this.topupIdealMaxTopUpAmount;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final List getTopupIdealSupportedCurrencies() {
        return this.topupIdealSupportedCurrencies;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: Z, reason: from getter */
    public final String getLoanManageCreditsUrl() {
        return this.loanManageCreditsUrl;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: Z0, reason: from getter */
    public final jo3.a getEuCashTopupLimit() {
        return this.euCashTopupLimit;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public final h getEuCashProcessorInfo() {
        return this.euCashProcessorInfo;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: a0, reason: from getter */
    public final Long getTopupIdealMinTopUpAmount() {
        return this.topupIdealMinTopUpAmount;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: a1, reason: from getter */
    public final List getSupportContactUsItems() {
        return this.supportContactUsItems;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCountriesNationalitiesSupported() {
        return this.countriesNationalitiesSupported;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: b0, reason: from getter */
    public final jo3.a getCardScaContactlessDeclineLimit() {
        return this.cardScaContactlessDeclineLimit;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: b1, reason: from getter */
    public final Long getLoanAmountMin() {
        return this.loanAmountMin;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPaymentLinkBlacklistCountries() {
        return this.paymentLinkBlacklistCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final Boolean getReferralAppClipEnabled() {
        return this.referralAppClipEnabled;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: c1, reason: from getter */
    public final List getCountriesOnlyLocalPhoneNumberSupported() {
        return this.countriesOnlyLocalPhoneNumberSupported;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getShowInsuranceIntermediationText() {
        return this.showInsuranceIntermediationText;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final g getDetectedLocation() {
        return this.detectedLocation;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: d1, reason: from getter */
    public final List getExternalContactsBlacklistCountries() {
        return this.externalContactsBlacklistCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getDefaultMandateLimitPerTransfer() {
        return this.defaultMandateLimitPerTransfer;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: e0, reason: from getter */
    public final List getLiteAppCountries() {
        return this.liteAppCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: e1, reason: from getter */
    public final String getTopupOpenBankingDefaultMethod() {
        return this.topupOpenBankingDefaultMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.securitySigninLockoutMinutes, eVar.securitySigninLockoutMinutes) && Intrinsics.f(this.securitySigninMaxAttempts, eVar.securitySigninMaxAttempts) && Intrinsics.f(this.merchantIconsUrl, eVar.merchantIconsUrl) && Intrinsics.f(this.googlePayEnableNormalCards, eVar.googlePayEnableNormalCards) && Intrinsics.f(this.cashbackVaultsRemovalDate, eVar.cashbackVaultsRemovalDate) && Intrinsics.f(this.countriesBlacklisted, eVar.countriesBlacklisted) && Intrinsics.f(this.countriesSupported, eVar.countriesSupported) && Intrinsics.f(this.countriesWaitingList, eVar.countriesWaitingList) && Intrinsics.f(this.countriesWithoutZip, eVar.countriesWithoutZip) && Intrinsics.f(this.countriesBuab, eVar.countriesBuab) && Intrinsics.f(this.countriesPhoneCodes, eVar.countriesPhoneCodes) && Intrinsics.f(this.countriesNationalitiesSupported, eVar.countriesNationalitiesSupported) && Intrinsics.f(this.postcodeSearchCountries, eVar.postcodeSearchCountries) && Intrinsics.f(this.addressSearchCountries, eVar.addressSearchCountries) && Intrinsics.f(this.addressNumberRequiredCountries, eVar.addressNumberRequiredCountries) && Intrinsics.f(this.countriesWithDigitalPostcode, eVar.countriesWithDigitalPostcode) && Intrinsics.f(this.maxActiveCardsCountMap, eVar.maxActiveCardsCountMap) && Intrinsics.f(this.topupMinAmount, eVar.topupMinAmount) && Intrinsics.f(this.topupDefaultAmount, eVar.topupDefaultAmount) && Intrinsics.f(this.legalFeesUrl, eVar.legalFeesUrl) && Intrinsics.f(this.cardMaxMonthlyUsageLimit, eVar.cardMaxMonthlyUsageLimit) && Intrinsics.f(this.loanManageCreditsUrl, eVar.loanManageCreditsUrl) && Intrinsics.f(this.loanPrivacyPolicyUrl, eVar.loanPrivacyPolicyUrl) && Intrinsics.f(this.loanTermMin, eVar.loanTermMin) && Intrinsics.f(this.loanTermMax, eVar.loanTermMax) && Intrinsics.f(this.loanTermDefault, eVar.loanTermDefault) && Intrinsics.f(this.loanAmountMin, eVar.loanAmountMin) && Intrinsics.f(this.loanAmountMax, eVar.loanAmountMax) && Intrinsics.f(this.loanAmountDefault, eVar.loanAmountDefault) && Intrinsics.f(this.loanIntervalAmount, eVar.loanIntervalAmount) && Intrinsics.f(this.loanBaseCurrency, eVar.loanBaseCurrency) && Intrinsics.f(this.loanCountriesSupported, eVar.loanCountriesSupported) && Intrinsics.f(this.newsIconsUrl, eVar.newsIconsUrl) && Intrinsics.f(this.cardDesignsUrl, eVar.cardDesignsUrl) && Intrinsics.f(this.walletCurrencies, eVar.walletCurrencies) && Intrinsics.f(this.walletExtraFxCurrencies, eVar.walletExtraFxCurrencies) && Intrinsics.f(this.cashbackCurrencies, eVar.cashbackCurrencies) && Intrinsics.f(this.walletProhibitedCurrencies, eVar.walletProhibitedCurrencies) && Intrinsics.f(this.topupCardCurrencies, eVar.topupCardCurrencies) && Intrinsics.f(this.topupBankTransferCurrencies, eVar.topupBankTransferCurrencies) && Intrinsics.f(this.topupGooglePayCurrencies, eVar.topupGooglePayCurrencies) && Intrinsics.f(this.topupDirectDebitCurrencies, eVar.topupDirectDebitCurrencies) && Intrinsics.f(this.topupSofortCreditLimits, eVar.topupSofortCreditLimits) && Intrinsics.f(this.topupSofortCountries, eVar.topupSofortCountries) && Intrinsics.f(this.topupIdealEnabled, eVar.topupIdealEnabled) && Intrinsics.f(this.topupIdealAvailableCountries, eVar.topupIdealAvailableCountries) && Intrinsics.f(this.topupIdealSupportedCurrencies, eVar.topupIdealSupportedCurrencies) && Intrinsics.f(this.topupIdealMinTopUpAmount, eVar.topupIdealMinTopUpAmount) && Intrinsics.f(this.topupIdealMaxTopUpAmount, eVar.topupIdealMaxTopUpAmount) && Intrinsics.f(this.paymentLinkBlacklistCountries, eVar.paymentLinkBlacklistCountries) && Intrinsics.f(this.tradingCommoditiesProvidedBy, eVar.tradingCommoditiesProvidedBy) && Intrinsics.f(this.tradingCommoditiesTermsOfBusinessUrl, eVar.tradingCommoditiesTermsOfBusinessUrl) && Intrinsics.f(this.externalContactsBlacklistCountries, eVar.externalContactsBlacklistCountries) && Intrinsics.f(this.appVersion, eVar.appVersion) && Intrinsics.f(this.appVersionExpiry, eVar.appVersionExpiry) && Intrinsics.f(this.cardDesignsVersion, eVar.cardDesignsVersion) && Intrinsics.f(this.noRegionCountries, eVar.noRegionCountries) && Intrinsics.f(this.supportContactUsItems, eVar.supportContactUsItems) && Intrinsics.f(this.appPopularCountries, eVar.appPopularCountries) && Intrinsics.f(this.outOfStockCardCodes, eVar.outOfStockCardCodes) && Intrinsics.f(this.freeToResideCountries, eVar.freeToResideCountries) && Intrinsics.f(this.kycDocumentsNotId, eVar.kycDocumentsNotId) && Intrinsics.f(this.cardDeliveryForcedHomeAddress, eVar.cardDeliveryForcedHomeAddress) && Intrinsics.f(this.transactionFetchThrottlePeriodSeconds, eVar.transactionFetchThrottlePeriodSeconds) && Intrinsics.f(this.transactionsDatabaseTimeoutMs, eVar.transactionsDatabaseTimeoutMs) && Intrinsics.f(this.allowFirstVirtualCardForFree, eVar.allowFirstVirtualCardForFree) && Intrinsics.f(this.disableViewPin, eVar.disableViewPin) && Intrinsics.f(this.peerToPeerCountryCurrenciesMap, eVar.peerToPeerCountryCurrenciesMap) && Intrinsics.f(this.cardScaContactlessDeclineLimit, eVar.cardScaContactlessDeclineLimit) && Intrinsics.f(this.cardScaContactlessNotifyLimit, eVar.cardScaContactlessNotifyLimit) && Intrinsics.f(this.cardPromptEnabled, eVar.cardPromptEnabled) && Intrinsics.f(this.cardCustomisationCompetitionConfig, eVar.cardCustomisationCompetitionConfig) && Intrinsics.f(this.showInsuranceIntermediationText, eVar.showInsuranceIntermediationText) && Intrinsics.f(this.isInsuranceHomeWidgetAvailable, eVar.isInsuranceHomeWidgetAvailable) && Intrinsics.f(this.transferMaxAmount, eVar.transferMaxAmount) && Intrinsics.f(this.dashboardPocketsWidgetVisibleByDefault, eVar.dashboardPocketsWidgetVisibleByDefault) && Intrinsics.f(this.comparePlansEntryPointAvailable, eVar.comparePlansEntryPointAvailable) && Intrinsics.f(this.topupOpenBankingDefaultMethod, eVar.topupOpenBankingDefaultMethod) && Intrinsics.f(this.usSsnOptional, eVar.usSsnOptional) && Intrinsics.f(this.openBankingAuthFlow, eVar.openBankingAuthFlow) && Intrinsics.f(this.giftingScheduledGiftSendTime, eVar.giftingScheduledGiftSendTime) && Intrinsics.f(this.openBankingIbanCountries, eVar.openBankingIbanCountries) && Intrinsics.f(this.liteAppCountries, eVar.liteAppCountries) && Intrinsics.f(this.cardTransferEligibleCountries, eVar.cardTransferEligibleCountries) && Intrinsics.f(this.customisationUnsupportedCountries, eVar.customisationUnsupportedCountries) && Intrinsics.f(this.exchangeDefaultCurrencyCode, eVar.exchangeDefaultCurrencyCode) && Intrinsics.f(this.prepaidCardsCountries, eVar.prepaidCardsCountries) && Intrinsics.f(this.maxMonthlyLimitForCurrencies, eVar.maxMonthlyLimitForCurrencies) && Intrinsics.f(this.isCaptchaEnabled, eVar.isCaptchaEnabled) && Intrinsics.f(this.defaultMandateLimitPerTransfer, eVar.defaultMandateLimitPerTransfer) && Intrinsics.f(this.mandateUpperLimit, eVar.mandateUpperLimit) && Intrinsics.f(this.previewCurrencies, eVar.previewCurrencies) && Intrinsics.f(this.cryptoAppCountries, eVar.cryptoAppCountries) && Intrinsics.f(this.detectedLocation, eVar.detectedLocation) && Intrinsics.f(this.customOnboardingStoriesEnabled, eVar.customOnboardingStoriesEnabled) && Intrinsics.f(this.customOnboardingIntro, eVar.customOnboardingIntro) && Intrinsics.f(this.euCashTopupLimit, eVar.euCashTopupLimit) && Intrinsics.f(this.euCashProcessorInfo, eVar.euCashProcessorInfo) && Intrinsics.f(this.p2pChatWelcomeStickers, eVar.p2pChatWelcomeStickers) && Intrinsics.f(this.p2pMinimumAmounts, eVar.p2pMinimumAmounts) && Intrinsics.f(this.countriesOnlyLocalPhoneNumberSupported, eVar.countriesOnlyLocalPhoneNumberSupported) && Intrinsics.f(this.onlyCitizensSupportedCountries, eVar.onlyCitizensSupportedCountries) && Intrinsics.f(this.countriesKnownMunicipalities, eVar.countriesKnownMunicipalities) && Intrinsics.f(this.referralCodeInProfileMaxEnabledDays, eVar.referralCodeInProfileMaxEnabledDays) && Intrinsics.f(this.atmPinChangeUnsupportedCountries, eVar.atmPinChangeUnsupportedCountries) && Intrinsics.f(this.deviceCooldownSeconds, eVar.deviceCooldownSeconds) && Intrinsics.f(this.autoBindReferralCodesEnabled, eVar.autoBindReferralCodesEnabled) && Intrinsics.f(this.referralCodesEnabled, eVar.referralCodesEnabled) && Intrinsics.f(this.referralAppClipEnabled, eVar.referralAppClipEnabled) && Intrinsics.f(this.referralsChatSupportedCountries, eVar.referralsChatSupportedCountries) && Intrinsics.f(this.isPreChangeWarningEnabled, eVar.isPreChangeWarningEnabled) && Intrinsics.f(this.restrictedDeliveryPostcodes, eVar.restrictedDeliveryPostcodes) && Intrinsics.f(this.savingsConfig, eVar.savingsConfig) && Intrinsics.f(this.nonExchangeableCurrencies, eVar.nonExchangeableCurrencies) && Intrinsics.f(this.bizumConfig, eVar.bizumConfig) && Intrinsics.f(this.topupCardsNumberLimit, eVar.topupCardsNumberLimit) && Intrinsics.f(this.allowedCountriesForCurrency, eVar.allowedCountriesForCurrency) && Intrinsics.f(this.countriesWithSelectableCity, eVar.countriesWithSelectableCity) && Intrinsics.f(this.onboardingConsolidatedAuth, eVar.onboardingConsolidatedAuth) && Intrinsics.f(this.onboardingKompot, eVar.onboardingKompot) && Intrinsics.f(this.commodityTradesProhibitedCurrencies, eVar.commodityTradesProhibitedCurrencies) && Intrinsics.f(this.numberlessCardToggleState, eVar.numberlessCardToggleState) && Intrinsics.f(this.onboardingRevolut10Refresh, eVar.onboardingRevolut10Refresh) && Intrinsics.f(this.userIsCobranded, eVar.userIsCobranded) && Intrinsics.f(this.countriesWithAddressCitySearch, eVar.countriesWithAddressCitySearch) && Intrinsics.f(this.countriesWithAddressRegionSearch, eVar.countriesWithAddressRegionSearch) && Intrinsics.f(this.transferLinkCurrencies, eVar.transferLinkCurrencies);
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getTopupDirectDebitCurrencies() {
        return this.topupDirectDebitCurrencies;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: f0, reason: from getter */
    public final Boolean getCustomOnboardingStoriesEnabled() {
        return this.customOnboardingStoriesEnabled;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: f1, reason: from getter */
    public final Boolean getOnboardingKompot() {
        return this.onboardingKompot;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: g, reason: from getter */
    public final Map getTopupMinAmount() {
        return this.topupMinAmount;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: g0, reason: from getter */
    public final String getMerchantIconsUrl() {
        return this.merchantIconsUrl;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: g1, reason: from getter */
    public final Boolean getAutoBindReferralCodesEnabled() {
        return this.autoBindReferralCodesEnabled;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getCardDeliveryForcedHomeAddress() {
        return this.cardDeliveryForcedHomeAddress;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: h0, reason: from getter */
    public final Long getLoanIntervalAmount() {
        return this.loanIntervalAmount;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final List getTopupSofortCountries() {
        return this.topupSofortCountries;
    }

    public final int hashCode() {
        String str = this.securitySigninLockoutMinutes;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.securitySigninMaxAttempts;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.merchantIconsUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.googlePayEnableNormalCards;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l2 = this.cashbackVaultsRemovalDate;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        List<String> list = this.countriesBlacklisted;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.countriesSupported;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.countriesWaitingList;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<String> list4 = this.countriesWithoutZip;
        int iHashCode9 = (iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<String> list5 = this.countriesBuab;
        int iHashCode10 = (iHashCode9 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<String> list6 = this.countriesPhoneCodes;
        int iHashCode11 = (iHashCode10 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<String> list7 = this.countriesNationalitiesSupported;
        int iHashCode12 = (iHashCode11 + (list7 == null ? 0 : list7.hashCode())) * 31;
        List<String> list8 = this.postcodeSearchCountries;
        int iHashCode13 = (iHashCode12 + (list8 == null ? 0 : list8.hashCode())) * 31;
        List<String> list9 = this.addressSearchCountries;
        int iHashCode14 = (iHashCode13 + (list9 == null ? 0 : list9.hashCode())) * 31;
        Set<String> set = this.addressNumberRequiredCountries;
        int iHashCode15 = (iHashCode14 + (set == null ? 0 : set.hashCode())) * 31;
        List<String> list10 = this.countriesWithDigitalPostcode;
        int iHashCode16 = (iHashCode15 + (list10 == null ? 0 : list10.hashCode())) * 31;
        Map<String, Integer> map = this.maxActiveCardsCountMap;
        int iHashCode17 = (iHashCode16 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Long> map2 = this.topupMinAmount;
        int iHashCode18 = (iHashCode17 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, Long> map3 = this.topupDefaultAmount;
        int iHashCode19 = (iHashCode18 + (map3 == null ? 0 : map3.hashCode())) * 31;
        String str4 = this.legalFeesUrl;
        int iHashCode20 = (iHashCode19 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.cardMaxMonthlyUsageLimit;
        int iHashCode21 = (iHashCode20 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str5 = this.loanManageCreditsUrl;
        int iHashCode22 = (iHashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.loanPrivacyPolicyUrl;
        int iHashCode23 = (iHashCode22 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.loanTermMin;
        int iHashCode24 = (iHashCode23 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.loanTermMax;
        int iHashCode25 = (iHashCode24 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.loanTermDefault;
        int iHashCode26 = (iHashCode25 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l4 = this.loanAmountMin;
        int iHashCode27 = (iHashCode26 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.loanAmountMax;
        int iHashCode28 = (iHashCode27 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l22 = this.loanAmountDefault;
        int iHashCode29 = (iHashCode28 + (l22 == null ? 0 : l22.hashCode())) * 31;
        Long l31 = this.loanIntervalAmount;
        int iHashCode30 = (iHashCode29 + (l31 == null ? 0 : l31.hashCode())) * 31;
        String str7 = this.loanBaseCurrency;
        int iHashCode31 = (iHashCode30 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<String> list11 = this.loanCountriesSupported;
        int iHashCode32 = (iHashCode31 + (list11 == null ? 0 : list11.hashCode())) * 31;
        String str8 = this.newsIconsUrl;
        int iHashCode33 = (iHashCode32 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cardDesignsUrl;
        int iHashCode34 = (iHashCode33 + (str9 == null ? 0 : str9.hashCode())) * 31;
        List<String> list12 = this.walletCurrencies;
        int iHashCode35 = (iHashCode34 + (list12 == null ? 0 : list12.hashCode())) * 31;
        List<String> list13 = this.walletExtraFxCurrencies;
        int iHashCode36 = (iHashCode35 + (list13 == null ? 0 : list13.hashCode())) * 31;
        List<String> list14 = this.cashbackCurrencies;
        int iHashCode37 = (iHashCode36 + (list14 == null ? 0 : list14.hashCode())) * 31;
        List<String> list15 = this.walletProhibitedCurrencies;
        int iHashCode38 = (iHashCode37 + (list15 == null ? 0 : list15.hashCode())) * 31;
        List<String> list16 = this.topupCardCurrencies;
        int iHashCode39 = (iHashCode38 + (list16 == null ? 0 : list16.hashCode())) * 31;
        List<String> list17 = this.topupBankTransferCurrencies;
        int iHashCode40 = (iHashCode39 + (list17 == null ? 0 : list17.hashCode())) * 31;
        List<String> list18 = this.topupGooglePayCurrencies;
        int iHashCode41 = (iHashCode40 + (list18 == null ? 0 : list18.hashCode())) * 31;
        List<String> list19 = this.topupDirectDebitCurrencies;
        int iHashCode42 = (iHashCode41 + (list19 == null ? 0 : list19.hashCode())) * 31;
        Map<String, Long> map4 = this.topupSofortCreditLimits;
        int iHashCode43 = (iHashCode42 + (map4 == null ? 0 : map4.hashCode())) * 31;
        List<String> list20 = this.topupSofortCountries;
        int iHashCode44 = (iHashCode43 + (list20 == null ? 0 : list20.hashCode())) * 31;
        Boolean bool2 = this.topupIdealEnabled;
        int iHashCode45 = (iHashCode44 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list21 = this.topupIdealAvailableCountries;
        int iHashCode46 = (iHashCode45 + (list21 == null ? 0 : list21.hashCode())) * 31;
        List<String> list22 = this.topupIdealSupportedCurrencies;
        int iHashCode47 = (iHashCode46 + (list22 == null ? 0 : list22.hashCode())) * 31;
        Long l37 = this.topupIdealMinTopUpAmount;
        int iHashCode48 = (iHashCode47 + (l37 == null ? 0 : l37.hashCode())) * 31;
        Long l39 = this.topupIdealMaxTopUpAmount;
        int iHashCode49 = (iHashCode48 + (l39 == null ? 0 : l39.hashCode())) * 31;
        List<String> list23 = this.paymentLinkBlacklistCountries;
        int iHashCode50 = (iHashCode49 + (list23 == null ? 0 : list23.hashCode())) * 31;
        String str10 = this.tradingCommoditiesProvidedBy;
        int iHashCode51 = (iHashCode50 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.tradingCommoditiesTermsOfBusinessUrl;
        int iHashCode52 = (iHashCode51 + (str11 == null ? 0 : str11.hashCode())) * 31;
        List<String> list24 = this.externalContactsBlacklistCountries;
        int iHashCode53 = (iHashCode52 + (list24 == null ? 0 : list24.hashCode())) * 31;
        String str12 = this.appVersion;
        int iHashCode54 = (iHashCode53 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Instant instant = this.appVersionExpiry;
        int iHashCode55 = (iHashCode54 + (instant == null ? 0 : instant.hashCode())) * 31;
        Integer num4 = this.cardDesignsVersion;
        int iHashCode56 = (iHashCode55 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<String> list25 = this.noRegionCountries;
        int iHashCode57 = (iHashCode56 + (list25 == null ? 0 : list25.hashCode())) * 31;
        List<l> list26 = this.supportContactUsItems;
        int iHashCode58 = (iHashCode57 + (list26 == null ? 0 : list26.hashCode())) * 31;
        List<String> list27 = this.appPopularCountries;
        int iHashCode59 = (iHashCode58 + (list27 == null ? 0 : list27.hashCode())) * 31;
        List<String> list28 = this.outOfStockCardCodes;
        int iHashCode60 = (iHashCode59 + (list28 == null ? 0 : list28.hashCode())) * 31;
        List<String> list29 = this.freeToResideCountries;
        int iHashCode61 = (iHashCode60 + (list29 == null ? 0 : list29.hashCode())) * 31;
        List<String> list30 = this.kycDocumentsNotId;
        int iHashCode62 = (iHashCode61 + (list30 == null ? 0 : list30.hashCode())) * 31;
        Boolean bool3 = this.cardDeliveryForcedHomeAddress;
        int iHashCode63 = (iHashCode62 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l51 = this.transactionFetchThrottlePeriodSeconds;
        int iHashCode64 = (iHashCode63 + (l51 == null ? 0 : l51.hashCode())) * 31;
        Long l52 = this.transactionsDatabaseTimeoutMs;
        int iHashCode65 = (iHashCode64 + (l52 == null ? 0 : l52.hashCode())) * 31;
        Boolean bool4 = this.allowFirstVirtualCardForFree;
        int iHashCode66 = (iHashCode65 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.disableViewPin;
        int iHashCode67 = (iHashCode66 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Map<String, List<String>> map5 = this.peerToPeerCountryCurrenciesMap;
        int iHashCode68 = (iHashCode67 + (map5 == null ? 0 : map5.hashCode())) * 31;
        jo3.a aVar = this.cardScaContactlessDeclineLimit;
        int iHashCode69 = (iHashCode68 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.cardScaContactlessNotifyLimit;
        int iHashCode70 = (iHashCode69 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        Boolean bool6 = this.cardPromptEnabled;
        int iHashCode71 = (iHashCode70 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        b bVar = this.cardCustomisationCompetitionConfig;
        int iHashCode72 = (iHashCode71 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool7 = this.showInsuranceIntermediationText;
        int iHashCode73 = (iHashCode72 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.isInsuranceHomeWidgetAvailable;
        int iHashCode74 = (iHashCode73 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        jo3.a aVar3 = this.transferMaxAmount;
        int iHashCode75 = (iHashCode74 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        Boolean bool9 = this.dashboardPocketsWidgetVisibleByDefault;
        int iHashCode76 = (iHashCode75 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.comparePlansEntryPointAvailable;
        int iHashCode77 = (iHashCode76 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        String str13 = this.topupOpenBankingDefaultMethod;
        int iHashCode78 = (iHashCode77 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool11 = this.usSsnOptional;
        int iHashCode79 = (iHashCode78 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        String str14 = this.openBankingAuthFlow;
        int iHashCode80 = (iHashCode79 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.giftingScheduledGiftSendTime;
        int iD = p.a.d((iHashCode80 + (str15 == null ? 0 : str15.hashCode())) * 31, 31, this.openBankingIbanCountries);
        List<String> list31 = this.liteAppCountries;
        int iHashCode81 = (iD + (list31 == null ? 0 : list31.hashCode())) * 31;
        List<String> list32 = this.cardTransferEligibleCountries;
        int iHashCode82 = (iHashCode81 + (list32 == null ? 0 : list32.hashCode())) * 31;
        List<String> list33 = this.customisationUnsupportedCountries;
        int iHashCode83 = (iHashCode82 + (list33 == null ? 0 : list33.hashCode())) * 31;
        String str16 = this.exchangeDefaultCurrencyCode;
        int iHashCode84 = (iHashCode83 + (str16 == null ? 0 : str16.hashCode())) * 31;
        List<String> list34 = this.prepaidCardsCountries;
        int iHashCode85 = (iHashCode84 + (list34 == null ? 0 : list34.hashCode())) * 31;
        Map<String, Long> map6 = this.maxMonthlyLimitForCurrencies;
        int iHashCode86 = (iHashCode85 + (map6 == null ? 0 : map6.hashCode())) * 31;
        Boolean bool12 = this.isCaptchaEnabled;
        int iHashCode87 = (iHashCode86 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        jo3.a aVar4 = this.defaultMandateLimitPerTransfer;
        int iHashCode88 = (iHashCode87 + (aVar4 == null ? 0 : aVar4.hashCode())) * 31;
        jo3.a aVar5 = this.mandateUpperLimit;
        int iHashCode89 = (iHashCode88 + (aVar5 == null ? 0 : aVar5.hashCode())) * 31;
        List<f> list35 = this.previewCurrencies;
        int iHashCode90 = (iHashCode89 + (list35 == null ? 0 : list35.hashCode())) * 31;
        List<String> list36 = this.cryptoAppCountries;
        int iHashCode91 = (iHashCode90 + (list36 == null ? 0 : list36.hashCode())) * 31;
        g gVar = this.detectedLocation;
        int iHashCode92 = (iHashCode91 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Boolean bool13 = this.customOnboardingStoriesEnabled;
        int iHashCode93 = (iHashCode92 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        j jVar = this.customOnboardingIntro;
        int iHashCode94 = (iHashCode93 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        jo3.a aVar6 = this.euCashTopupLimit;
        int iHashCode95 = (iHashCode94 + (aVar6 == null ? 0 : aVar6.hashCode())) * 31;
        h hVar = this.euCashProcessorInfo;
        int iHashCode96 = (iHashCode95 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        List<String> list37 = this.p2pChatWelcomeStickers;
        int iHashCode97 = (iHashCode96 + (list37 == null ? 0 : list37.hashCode())) * 31;
        Map<String, Long> map7 = this.p2pMinimumAmounts;
        int iD2 = p.a.d(p.a.d(p.a.d((iHashCode97 + (map7 == null ? 0 : map7.hashCode())) * 31, 31, this.countriesOnlyLocalPhoneNumberSupported), 31, this.onlyCitizensSupportedCountries), 31, this.countriesKnownMunicipalities);
        Integer num5 = this.referralCodeInProfileMaxEnabledDays;
        int iHashCode98 = (iD2 + (num5 == null ? 0 : num5.hashCode())) * 31;
        List<String> list38 = this.atmPinChangeUnsupportedCountries;
        int iHashCode99 = (iHashCode98 + (list38 == null ? 0 : list38.hashCode())) * 31;
        Long l60 = this.deviceCooldownSeconds;
        int iHashCode100 = (iHashCode99 + (l60 == null ? 0 : l60.hashCode())) * 31;
        Boolean bool14 = this.autoBindReferralCodesEnabled;
        int iHashCode101 = (iHashCode100 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.referralCodesEnabled;
        int iHashCode102 = (iHashCode101 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.referralAppClipEnabled;
        int iHashCode103 = (iHashCode102 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        List<String> list39 = this.referralsChatSupportedCountries;
        int iHashCode104 = (iHashCode103 + (list39 == null ? 0 : list39.hashCode())) * 31;
        Boolean bool17 = this.isPreChangeWarningEnabled;
        int iHashCode105 = (iHashCode104 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Map<String, List<String>> map8 = this.restrictedDeliveryPostcodes;
        int iHashCode106 = (iHashCode105 + (map8 == null ? 0 : map8.hashCode())) * 31;
        k kVar = this.savingsConfig;
        int iHashCode107 = (iHashCode106 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        List<String> list40 = this.nonExchangeableCurrencies;
        int iHashCode108 = (iHashCode107 + (list40 == null ? 0 : list40.hashCode())) * 31;
        a aVar7 = this.bizumConfig;
        int iHashCode109 = (iHashCode108 + (aVar7 == null ? 0 : aVar7.hashCode())) * 31;
        Integer num6 = this.topupCardsNumberLimit;
        int iHashCode110 = (iHashCode109 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Map<String, List<String>> map9 = this.allowedCountriesForCurrency;
        int iHashCode111 = (iHashCode110 + (map9 == null ? 0 : map9.hashCode())) * 31;
        List<String> list41 = this.countriesWithSelectableCity;
        int iHashCode112 = (iHashCode111 + (list41 == null ? 0 : list41.hashCode())) * 31;
        String str17 = this.onboardingConsolidatedAuth;
        int iHashCode113 = (iHashCode112 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Boolean bool18 = this.onboardingKompot;
        int iHashCode114 = (iHashCode113 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        List<String> list42 = this.commodityTradesProhibitedCurrencies;
        int iHashCode115 = (iHashCode114 + (list42 == null ? 0 : list42.hashCode())) * 31;
        Boolean bool19 = this.numberlessCardToggleState;
        int iHashCode116 = (iHashCode115 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.onboardingRevolut10Refresh;
        int iHashCode117 = (iHashCode116 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.userIsCobranded;
        int iHashCode118 = (iHashCode117 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        List<String> list43 = this.countriesWithAddressCitySearch;
        int iHashCode119 = (iHashCode118 + (list43 == null ? 0 : list43.hashCode())) * 31;
        List<String> list44 = this.countriesWithAddressRegionSearch;
        int iHashCode120 = (iHashCode119 + (list44 == null ? 0 : list44.hashCode())) * 31;
        List<String> list45 = this.transferLinkCurrencies;
        return iHashCode120 + (list45 != null ? list45.hashCode() : 0);
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: i, reason: from getter */
    public final j getCustomOnboardingIntro() {
        return this.customOnboardingIntro;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: i0, reason: from getter */
    public final String getCardDesignsUrl() {
        return this.cardDesignsUrl;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: i1, reason: from getter */
    public final Boolean getAllowFirstVirtualCardForFree() {
        return this.allowFirstVirtualCardForFree;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getLoanAmountMax() {
        return this.loanAmountMax;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final Map getPeerToPeerCountryCurrenciesMap() {
        return this.peerToPeerCountryCurrenciesMap;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: j1, reason: from getter */
    public final String getGiftingScheduledGiftSendTime() {
        return this.giftingScheduledGiftSendTime;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: k, reason: from getter */
    public final List getTopupIdealAvailableCountries() {
        return this.topupIdealAvailableCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: k0, reason: from getter */
    public final List getOutOfStockCardCodes() {
        return this.outOfStockCardCodes;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: k1, reason: from getter */
    public final Boolean getDashboardPocketsWidgetVisibleByDefault() {
        return this.dashboardPocketsWidgetVisibleByDefault;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getAppPopularCountries() {
        return this.appPopularCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: l0, reason: from getter */
    public final String getLoanBaseCurrency() {
        return this.loanBaseCurrency;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: l1, reason: from getter */
    public final List getAtmPinChangeUnsupportedCountries() {
        return this.atmPinChangeUnsupportedCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: m, reason: from getter */
    public final Map getMaxActiveCardsCountMap() {
        return this.maxActiveCardsCountMap;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: m0, reason: from getter */
    public final List getCountriesWaitingList() {
        return this.countriesWaitingList;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: m1, reason: from getter */
    public final Boolean getDisableViewPin() {
        return this.disableViewPin;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: n, reason: from getter */
    public final List getCountriesKnownMunicipalities() {
        return this.countriesKnownMunicipalities;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: n0, reason: from getter */
    public final Integer getLoanTermMin() {
        return this.loanTermMin;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final Set getAddressNumberRequiredCountries() {
        return this.addressNumberRequiredCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: o, reason: from getter */
    public final List getCardTransferEligibleCountries() {
        return this.cardTransferEligibleCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: o0, reason: from getter */
    public final String getOnboardingConsolidatedAuth() {
        return this.onboardingConsolidatedAuth;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: o1, reason: from getter */
    public final Integer getTopupCardsNumberLimit() {
        return this.topupCardsNumberLimit;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: p, reason: from getter */
    public final List getCustomisationUnsupportedCountries() {
        return this.customisationUnsupportedCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: p0, reason: from getter */
    public final List getCountriesWithAddressCitySearch() {
        return this.countriesWithAddressCitySearch;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: p1, reason: from getter */
    public final List getCryptoAppCountries() {
        return this.cryptoAppCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: q, reason: from getter */
    public final List getCashbackCurrencies() {
        return this.cashbackCurrencies;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: q0, reason: from getter */
    public final Boolean getNumberlessCardToggleState() {
        return this.numberlessCardToggleState;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: q1, reason: from getter */
    public final Map getRestrictedDeliveryPostcodes() {
        return this.restrictedDeliveryPostcodes;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: r, reason: from getter */
    public final List getCountriesSupported() {
        return this.countriesSupported;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: r0, reason: from getter */
    public final List getCountriesWithDigitalPostcode() {
        return this.countriesWithDigitalPostcode;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: r1, reason: from getter */
    public final List getTransferLinkCurrencies() {
        return this.transferLinkCurrencies;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getLegalFeesUrl() {
        return this.legalFeesUrl;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: s0, reason: from getter */
    public final List getNonExchangeableCurrencies() {
        return this.nonExchangeableCurrencies;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: s1, reason: from getter */
    public final Long getCardMaxMonthlyUsageLimit() {
        return this.cardMaxMonthlyUsageLimit;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: t, reason: from getter */
    public final List getAddressSearchCountries() {
        return this.addressSearchCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: t0, reason: from getter */
    public final String getSecuritySigninLockoutMinutes() {
        return this.securitySigninLockoutMinutes;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: t1, reason: from getter */
    public final String getTradingCommoditiesProvidedBy() {
        return this.tradingCommoditiesProvidedBy;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: u, reason: from getter */
    public final List getWalletProhibitedCurrencies() {
        return this.walletProhibitedCurrencies;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: u0, reason: from getter */
    public final Boolean getIsCaptchaEnabled() {
        return this.isCaptchaEnabled;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: u1, reason: from getter */
    public final List getPreviewCurrencies() {
        return this.previewCurrencies;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getExchangeDefaultCurrencyCode() {
        return this.exchangeDefaultCurrencyCode;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: v0, reason: from getter */
    public final String getSecuritySigninMaxAttempts() {
        return this.securitySigninMaxAttempts;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: v1, reason: from getter */
    public final k getSavingsConfig() {
        return this.savingsConfig;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: w, reason: from getter */
    public final List getOnlyCitizensSupportedCountries() {
        return this.onlyCitizensSupportedCountries;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: w0, reason: from getter */
    public final jo3.a getCardScaContactlessNotifyLimit() {
        return this.cardScaContactlessNotifyLimit;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: x, reason: from getter */
    public final a getBizumConfig() {
        return this.bizumConfig;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final Boolean getReferralCodesEnabled() {
        return this.referralCodesEnabled;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getOpenBankingAuthFlow() {
        return this.openBankingAuthFlow;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: y0, reason: from getter */
    public final Integer getLoanTermMax() {
        return this.loanTermMax;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: z, reason: from getter */
    public final List getCountriesWithoutZip() {
        return this.countriesWithoutZip;
    }

    @Override // j7l.c
    /* JADX INFO: renamed from: z0, reason: from getter */
    public final List getWalletExtraFxCurrencies() {
        return this.walletExtraFxCurrencies;
    }

    public e(String str, String str2, String str3, Boolean bool, Long l2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, List list, List list2, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Map map, Map map2, Map map3, String str4, Long l3, String str5, String str6, Integer num, Integer num2, Integer num3, Long l4, Long l5, Long l22, Long l31, String str7, List list3, String str8, String str9, List list4, ArrayList arrayList9, ArrayList arrayList10, ArrayList arrayList11, List list5, List list6, ArrayList arrayList12, ArrayList arrayList13, Map map4, ArrayList arrayList14, Boolean bool2, ArrayList arrayList15, ArrayList arrayList16, Long l37, Long l39, ArrayList arrayList17, String str10, String str11, ArrayList arrayList18, String str12, Instant instant, Integer num4, ArrayList arrayList19, ArrayList arrayList20, ArrayList arrayList21, ArrayList arrayList22, ArrayList arrayList23, Boolean bool3, Long l51, Long l52, Boolean bool4, Boolean bool5, Map map5, jo3.a aVar, jo3.a aVar2, Boolean bool6, b bVar, Boolean bool7, Boolean bool8, jo3.a aVar3, Boolean bool9, Boolean bool10, String str13, Boolean bool11, String str14, String str15, ArrayList arrayList24, ArrayList arrayList25, ArrayList arrayList26, ArrayList arrayList27, LinkedHashMap linkedHashMap, Boolean bool12, jo3.a aVar4, jo3.a aVar5, ArrayList arrayList28, ArrayList arrayList29, g gVar, Boolean bool13, j jVar, jo3.a aVar6, h hVar, List list7, Map map6, ArrayList arrayList30, ArrayList arrayList31, ArrayList arrayList32, Integer num5, ArrayList arrayList33, Long l60, Boolean bool14, Boolean bool15, Boolean bool16, ArrayList arrayList34, Boolean bool17, Map map7, k kVar, List list8, a aVar7, Integer num6, LinkedHashMap linkedHashMap2, ArrayList arrayList35, String str16, Boolean bool18, ArrayList arrayList36, Boolean bool19, Boolean bool20, Boolean bool21, ArrayList arrayList37, ArrayList arrayList38, List list9, int i, int i2, int i3, int i5) {
        String str17;
        List<String> openBankingIbanCountries;
        Boolean bool22;
        List<String> countriesOnlyLocalPhoneNumberSupported;
        ArrayList arrayList39;
        List<String> onlyCitizensSupportedCountries;
        ArrayList arrayList40;
        List<String> countriesKnownMunicipalities;
        String str18 = (i & 1) != 0 ? null : str;
        String str19 = (i & 2) != 0 ? null : str2;
        String str20 = (i & 4) != 0 ? null : str3;
        Boolean bool23 = (i & 8) != 0 ? null : bool;
        Long l66 = (i & 16) != 0 ? null : l2;
        ArrayList arrayList41 = (i & 32) != 0 ? null : arrayList;
        ArrayList arrayList42 = (i & 64) != 0 ? null : arrayList2;
        ArrayList arrayList43 = (i & 128) != 0 ? null : arrayList3;
        ArrayList arrayList44 = (i & 256) != 0 ? null : arrayList4;
        ArrayList arrayList45 = (i & 512) != 0 ? null : arrayList5;
        List list10 = (i & 1024) != 0 ? null : list;
        List list11 = (i & 2048) != 0 ? null : list2;
        ArrayList arrayList46 = (i & 4096) != 0 ? null : arrayList6;
        ArrayList arrayList47 = (i & 8192) != 0 ? null : arrayList7;
        ArrayList arrayList48 = (i & 32768) != 0 ? null : arrayList8;
        Map map8 = (i & 65536) != 0 ? null : map;
        Map map9 = (i & 131072) != 0 ? null : map2;
        Map map10 = (i & 262144) != 0 ? null : map3;
        String str21 = (i & 524288) != 0 ? null : str4;
        Long l69 = (i & PKIFailureInfo.badCertTemplate) != 0 ? null : l3;
        String str22 = (i & PKIFailureInfo.badSenderNonce) != 0 ? null : str5;
        String str23 = (i & 4194304) != 0 ? null : str6;
        Integer num7 = (i & 8388608) != 0 ? null : num;
        Integer num8 = (i & 16777216) != 0 ? null : num2;
        Integer num9 = (i & 33554432) != 0 ? null : num3;
        Long l79 = (i & 67108864) != 0 ? null : l4;
        Long l81 = (i & 134217728) != 0 ? null : l5;
        Long l82 = (i & 268435456) != 0 ? null : l22;
        Long l90 = (i & PKIFailureInfo.duplicateCertReq) != 0 ? null : l31;
        String str24 = (i & 1073741824) != 0 ? null : str7;
        List list12 = (i & Integer.MIN_VALUE) != 0 ? null : list3;
        String str25 = (i2 & 1) != 0 ? null : str8;
        String str26 = (i2 & 2) != 0 ? null : str9;
        List list13 = (i2 & 4) != 0 ? null : list4;
        ArrayList arrayList49 = (i2 & 8) != 0 ? null : arrayList9;
        ArrayList arrayList50 = (i2 & 16) != 0 ? null : arrayList10;
        ArrayList arrayList51 = (i2 & 32) != 0 ? null : arrayList11;
        List list14 = (i2 & 64) != 0 ? null : list5;
        ArrayList arrayList52 = arrayList48;
        List list15 = (i2 & 128) != 0 ? null : list6;
        ArrayList arrayList53 = (i2 & 256) != 0 ? null : arrayList12;
        ArrayList arrayList54 = (i2 & 512) != 0 ? null : arrayList13;
        Map map11 = (i2 & 1024) != 0 ? null : map4;
        ArrayList arrayList55 = (i2 & 2048) != 0 ? null : arrayList14;
        Boolean bool24 = (i2 & 4096) != 0 ? null : bool2;
        ArrayList arrayList56 = (i2 & 8192) != 0 ? null : arrayList15;
        ArrayList arrayList57 = (i2 & 16384) != 0 ? null : arrayList16;
        Long l100 = (i2 & 32768) != 0 ? null : l37;
        Long l101 = (i2 & 65536) != 0 ? null : l39;
        ArrayList arrayList58 = (i2 & 131072) != 0 ? null : arrayList17;
        String str27 = (i2 & 262144) != 0 ? null : str10;
        String str28 = (i2 & 524288) != 0 ? null : str11;
        ArrayList arrayList59 = (i2 & PKIFailureInfo.badCertTemplate) != 0 ? null : arrayList18;
        String str29 = (i2 & PKIFailureInfo.badSenderNonce) != 0 ? null : str12;
        Instant instant2 = (i2 & 4194304) != 0 ? null : instant;
        Integer num10 = (i2 & 8388608) != 0 ? null : num4;
        ArrayList arrayList60 = (i2 & 16777216) != 0 ? null : arrayList19;
        ArrayList arrayList61 = (i2 & 33554432) != 0 ? null : arrayList20;
        ArrayList arrayList62 = (i2 & 67108864) != 0 ? null : arrayList21;
        ArrayList arrayList63 = (i2 & 134217728) != 0 ? null : arrayList22;
        ArrayList arrayList64 = (i2 & 268435456) != 0 ? null : arrayList23;
        Boolean bool25 = (i2 & 1073741824) != 0 ? null : bool3;
        Long l102 = (i2 & Integer.MIN_VALUE) != 0 ? null : l51;
        Long l103 = (i3 & 1) != 0 ? null : l52;
        Boolean bool26 = (i3 & 2) != 0 ? null : bool4;
        Boolean bool27 = (i3 & 4) != 0 ? null : bool5;
        Map map12 = (i3 & 8) != 0 ? null : map5;
        jo3.a aVar8 = (i3 & 16) != 0 ? null : aVar;
        jo3.a aVar9 = (i3 & 32) != 0 ? null : aVar2;
        Boolean bool28 = (i3 & 64) != 0 ? null : bool6;
        Long l104 = l100;
        b bVar2 = (i3 & 128) != 0 ? null : bVar;
        Boolean bool29 = (i3 & 256) != 0 ? null : bool7;
        Boolean bool30 = (i3 & 512) != 0 ? null : bool8;
        jo3.a aVar10 = (i3 & 1024) != 0 ? null : aVar3;
        Boolean bool31 = (i3 & 2048) != 0 ? null : bool9;
        Boolean bool32 = (i3 & 4096) != 0 ? null : bool10;
        String str30 = (i3 & 8192) != 0 ? null : str13;
        Boolean bool33 = (i3 & 16384) != 0 ? null : bool11;
        String str31 = (i3 & 32768) != 0 ? null : str14;
        String str32 = (i3 & 65536) != 0 ? null : str15;
        if ((i3 & 131072) != 0) {
            str17 = str31;
            openBankingIbanCountries = f0.f322471a;
        } else {
            str17 = str31;
            openBankingIbanCountries = arrayList24;
        }
        ArrayList arrayList65 = (i3 & 262144) != 0 ? null : arrayList25;
        ArrayList arrayList66 = (i3 & 524288) != 0 ? null : arrayList26;
        ArrayList arrayList67 = (i3 & 4194304) != 0 ? null : arrayList27;
        LinkedHashMap linkedHashMap3 = (i3 & 8388608) != 0 ? null : linkedHashMap;
        Boolean bool34 = (i3 & 16777216) != 0 ? null : bool12;
        jo3.a aVar11 = (i3 & 33554432) != 0 ? null : aVar4;
        jo3.a aVar12 = (i3 & 67108864) != 0 ? null : aVar5;
        ArrayList arrayList68 = (i3 & 134217728) != 0 ? null : arrayList28;
        ArrayList arrayList69 = (i3 & 268435456) != 0 ? null : arrayList29;
        g gVar2 = (i3 & PKIFailureInfo.duplicateCertReq) != 0 ? null : gVar;
        Boolean bool35 = (i3 & 1073741824) != 0 ? null : bool13;
        j jVar2 = (i3 & Integer.MIN_VALUE) != 0 ? null : jVar;
        jo3.a aVar13 = (i5 & 1) != 0 ? null : aVar6;
        h hVar2 = (i5 & 2) != 0 ? null : hVar;
        List list16 = (i5 & 4) != 0 ? null : list7;
        Map map13 = (i5 & 8) != 0 ? null : map6;
        if ((i5 & 16) != 0) {
            bool22 = bool33;
            countriesOnlyLocalPhoneNumberSupported = f0.f322471a;
        } else {
            bool22 = bool33;
            countriesOnlyLocalPhoneNumberSupported = arrayList30;
        }
        if ((i5 & 32) != 0) {
            arrayList39 = arrayList57;
            onlyCitizensSupportedCountries = f0.f322471a;
        } else {
            arrayList39 = arrayList57;
            onlyCitizensSupportedCountries = arrayList31;
        }
        if ((i5 & 64) != 0) {
            arrayList40 = arrayList47;
            countriesKnownMunicipalities = f0.f322471a;
        } else {
            arrayList40 = arrayList47;
            countriesKnownMunicipalities = arrayList32;
        }
        ArrayList arrayList70 = arrayList45;
        Integer num11 = (i5 & 128) != 0 ? null : num5;
        ArrayList arrayList71 = (i5 & 256) != 0 ? null : arrayList33;
        Long l105 = (i5 & 512) != 0 ? null : l60;
        Boolean bool36 = (i5 & 1024) != 0 ? null : bool14;
        Boolean bool37 = (i5 & 2048) != 0 ? null : bool15;
        Boolean bool38 = (i5 & 4096) != 0 ? null : bool16;
        ArrayList arrayList72 = (i5 & 8192) != 0 ? null : arrayList34;
        Boolean bool39 = (i5 & 16384) != 0 ? null : bool17;
        Map map14 = (i5 & 32768) != 0 ? null : map7;
        k kVar2 = (i5 & 65536) != 0 ? null : kVar;
        List list17 = (i5 & 131072) != 0 ? null : list8;
        a aVar14 = (i5 & 262144) != 0 ? null : aVar7;
        Integer num12 = (i5 & 524288) != 0 ? null : num6;
        LinkedHashMap linkedHashMap4 = (i5 & PKIFailureInfo.badCertTemplate) != 0 ? null : linkedHashMap2;
        ArrayList arrayList73 = (i5 & PKIFailureInfo.badSenderNonce) != 0 ? null : arrayList35;
        String str33 = (i5 & 4194304) != 0 ? null : str16;
        Boolean bool40 = (i5 & 8388608) != 0 ? null : bool18;
        ArrayList arrayList74 = (i5 & 16777216) != 0 ? null : arrayList36;
        Boolean bool41 = (i5 & 33554432) != 0 ? null : bool19;
        Boolean bool42 = (i5 & 67108864) != 0 ? null : bool20;
        Boolean bool43 = (i5 & 134217728) != 0 ? null : bool21;
        ArrayList arrayList75 = (i5 & 268435456) != 0 ? null : arrayList37;
        ArrayList arrayList76 = (i5 & PKIFailureInfo.duplicateCertReq) != 0 ? null : arrayList38;
        List list18 = (i5 & 1073741824) != 0 ? null : list9;
        Map map15 = map14;
        Intrinsics.checkNotNullParameter(openBankingIbanCountries, "openBankingIbanCountries");
        Intrinsics.checkNotNullParameter(countriesOnlyLocalPhoneNumberSupported, "countriesOnlyLocalPhoneNumberSupported");
        Intrinsics.checkNotNullParameter(onlyCitizensSupportedCountries, "onlyCitizensSupportedCountries");
        Intrinsics.checkNotNullParameter(countriesKnownMunicipalities, "countriesKnownMunicipalities");
        this.securitySigninLockoutMinutes = str18;
        this.securitySigninMaxAttempts = str19;
        this.merchantIconsUrl = str20;
        this.googlePayEnableNormalCards = bool23;
        this.cashbackVaultsRemovalDate = l66;
        this.countriesBlacklisted = arrayList41;
        this.countriesSupported = arrayList42;
        this.countriesWaitingList = arrayList43;
        this.countriesWithoutZip = arrayList44;
        this.countriesBuab = arrayList70;
        this.countriesPhoneCodes = list10;
        this.countriesNationalitiesSupported = list11;
        this.postcodeSearchCountries = arrayList46;
        this.addressSearchCountries = arrayList40;
        this.addressNumberRequiredCountries = null;
        this.countriesWithDigitalPostcode = arrayList52;
        this.maxActiveCardsCountMap = map8;
        this.topupMinAmount = map9;
        this.topupDefaultAmount = map10;
        this.legalFeesUrl = str21;
        this.cardMaxMonthlyUsageLimit = l69;
        this.loanManageCreditsUrl = str22;
        this.loanPrivacyPolicyUrl = str23;
        this.loanTermMin = num7;
        this.loanTermMax = num8;
        this.loanTermDefault = num9;
        this.loanAmountMin = l79;
        this.loanAmountMax = l81;
        this.loanAmountDefault = l82;
        this.loanIntervalAmount = l90;
        this.loanBaseCurrency = str24;
        this.loanCountriesSupported = list12;
        this.newsIconsUrl = str25;
        this.cardDesignsUrl = str26;
        this.walletCurrencies = list13;
        this.walletExtraFxCurrencies = arrayList49;
        this.cashbackCurrencies = arrayList50;
        this.walletProhibitedCurrencies = arrayList51;
        this.topupCardCurrencies = list14;
        this.topupBankTransferCurrencies = list15;
        this.topupGooglePayCurrencies = arrayList53;
        this.topupDirectDebitCurrencies = arrayList54;
        this.topupSofortCreditLimits = map11;
        this.topupSofortCountries = arrayList55;
        this.topupIdealEnabled = bool24;
        this.topupIdealAvailableCountries = arrayList56;
        this.topupIdealSupportedCurrencies = arrayList39;
        this.topupIdealMinTopUpAmount = l104;
        this.topupIdealMaxTopUpAmount = l101;
        this.paymentLinkBlacklistCountries = arrayList58;
        this.tradingCommoditiesProvidedBy = str27;
        this.tradingCommoditiesTermsOfBusinessUrl = str28;
        this.externalContactsBlacklistCountries = arrayList59;
        this.appVersion = str29;
        this.appVersionExpiry = instant2;
        this.cardDesignsVersion = num10;
        this.noRegionCountries = arrayList60;
        this.supportContactUsItems = arrayList61;
        this.appPopularCountries = arrayList62;
        this.outOfStockCardCodes = arrayList63;
        this.freeToResideCountries = arrayList64;
        this.kycDocumentsNotId = null;
        this.cardDeliveryForcedHomeAddress = bool25;
        this.transactionFetchThrottlePeriodSeconds = l102;
        this.transactionsDatabaseTimeoutMs = l103;
        this.allowFirstVirtualCardForFree = bool26;
        this.disableViewPin = bool27;
        this.peerToPeerCountryCurrenciesMap = map12;
        this.cardScaContactlessDeclineLimit = aVar8;
        this.cardScaContactlessNotifyLimit = aVar9;
        this.cardPromptEnabled = bool28;
        this.cardCustomisationCompetitionConfig = bVar2;
        this.showInsuranceIntermediationText = bool29;
        this.isInsuranceHomeWidgetAvailable = bool30;
        this.transferMaxAmount = aVar10;
        this.dashboardPocketsWidgetVisibleByDefault = bool31;
        this.comparePlansEntryPointAvailable = bool32;
        this.topupOpenBankingDefaultMethod = str30;
        this.usSsnOptional = bool22;
        this.openBankingAuthFlow = str17;
        this.giftingScheduledGiftSendTime = str32;
        this.openBankingIbanCountries = openBankingIbanCountries;
        this.liteAppCountries = arrayList65;
        this.cardTransferEligibleCountries = arrayList66;
        this.customisationUnsupportedCountries = null;
        this.exchangeDefaultCurrencyCode = null;
        this.prepaidCardsCountries = arrayList67;
        this.maxMonthlyLimitForCurrencies = linkedHashMap3;
        this.isCaptchaEnabled = bool34;
        this.defaultMandateLimitPerTransfer = aVar11;
        this.mandateUpperLimit = aVar12;
        this.previewCurrencies = arrayList68;
        this.cryptoAppCountries = arrayList69;
        this.detectedLocation = gVar2;
        this.customOnboardingStoriesEnabled = bool35;
        this.customOnboardingIntro = jVar2;
        this.euCashTopupLimit = aVar13;
        this.euCashProcessorInfo = hVar2;
        this.p2pChatWelcomeStickers = list16;
        this.p2pMinimumAmounts = map13;
        this.countriesOnlyLocalPhoneNumberSupported = countriesOnlyLocalPhoneNumberSupported;
        this.onlyCitizensSupportedCountries = onlyCitizensSupportedCountries;
        this.countriesKnownMunicipalities = countriesKnownMunicipalities;
        this.referralCodeInProfileMaxEnabledDays = num11;
        this.atmPinChangeUnsupportedCountries = arrayList71;
        this.deviceCooldownSeconds = l105;
        this.autoBindReferralCodesEnabled = bool36;
        this.referralCodesEnabled = bool37;
        this.referralAppClipEnabled = bool38;
        this.referralsChatSupportedCountries = arrayList72;
        this.isPreChangeWarningEnabled = bool39;
        this.restrictedDeliveryPostcodes = map15;
        this.savingsConfig = kVar2;
        this.nonExchangeableCurrencies = list17;
        this.bizumConfig = aVar14;
        this.topupCardsNumberLimit = num12;
        this.allowedCountriesForCurrency = linkedHashMap4;
        this.countriesWithSelectableCity = arrayList73;
        this.onboardingConsolidatedAuth = str33;
        this.onboardingKompot = bool40;
        this.commodityTradesProhibitedCurrencies = arrayList74;
        this.numberlessCardToggleState = bool41;
        this.onboardingRevolut10Refresh = bool42;
        this.userIsCobranded = bool43;
        this.countriesWithAddressCitySearch = arrayList75;
        this.countriesWithAddressRegionSearch = arrayList76;
        this.transferLinkCurrencies = list18;
    }
}
