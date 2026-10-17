package xhf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000è\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010 \u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010%\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b'\u0010\u0004R\u001a\u0010*\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u001a\u0010,\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b+\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R\u001c\u0010/\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\u0004R\u001a\u00102\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b0\u0010\u0017\u001a\u0004\b1\u0010\u0019R\u001a\u00105\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b3\u0010\u0017\u001a\u0004\b4\u0010\u0019R\u001a\u00108\u001a\u00020\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b6\u0010\u0017\u001a\u0004\b7\u0010\u0019R\u001c\u0010;\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b9\u0010\"\u001a\u0004\b:\u0010$R\u001c\u0010=\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\b<\u0010\"\u001a\u0004\b+\u0010$R\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b?\u0010\u0004R\u001c\u0010C\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\u0004R\u001c\u0010F\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\u0004R\u001c\u0010L\u001a\u0004\u0018\u00010G8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001c\u0010O\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\u0004R\u001a\u0010Q\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\bM\u0010\u0004R\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\bS\u0010\u0004R\u001c\u0010W\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\bU\u0010\u0006\u001a\u0004\bV\u0010\u0004R\u001c\u0010]\u001a\u0004\u0018\u00010X8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001c\u0010c\u001a\u0004\u0018\u00010^8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001c\u0010h\u001a\u0004\u0018\u00010d8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bE\u0010e\u001a\u0004\bf\u0010gR\u001c\u0010j\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\bi\u0010\u0004R\u001c\u0010m\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\bk\u0010\u0006\u001a\u0004\bl\u0010\u0004R\u001c\u0010p\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\f\n\u0004\bn\u0010\"\u001a\u0004\bo\u0010$R\u001c\u0010v\u001a\u0004\u0018\u00010q8\u0016X\u0097\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001c\u0010w\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\bD\u0010\u0004R\u001a\u0010|\u001a\u00020x8\u0016X\u0097\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b\u0005\u0010{R\u001c\u0010~\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b}\u0010\u0004R \u0010\u0083\u0001\u001a\u0004\u0018\u00010\u007f8\u0016X\u0097\u0004¢\u0006\u000f\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0005\bk\u0010\u0082\u0001R \u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b'\u0010\u0085\u0001\u001a\u0005\b)\u0010\u0086\u0001R\"\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0088\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R!\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008e\u00018\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b?\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\"\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R!\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b}\u0010\u009a\u0001\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\"\u0010 \u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009a\u0001\u001a\u0006\b\u009f\u0001\u0010\u009c\u0001R\"\u0010¦\u0001\u001a\u0005\u0018\u00010¡\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R\u001f\u0010©\u0001\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b§\u0001\u0010\u0006\u001a\u0005\b¨\u0001\u0010\u0004R\u001f\u0010«\u0001\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b¨\u0001\u0010\u0006\u001a\u0005\bª\u0001\u0010\u0004R\"\u0010±\u0001\u001a\u0005\u0018\u00010¬\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b¯\u0001\u0010°\u0001R \u0010µ\u0001\u001a\u0005\u0018\u00010²\u00018\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b4\u0010³\u0001\u001a\u0005\b0\u0010´\u0001R\"\u0010¸\u0001\u001a\u0005\u0018\u00010¬\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b¶\u0001\u0010®\u0001\u001a\u0006\b·\u0001\u0010°\u0001R\u001e\u0010º\u0001\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\r\n\u0004\b1\u0010\u0006\u001a\u0005\b¹\u0001\u0010\u0004R\u001d\u0010»\u0001\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\br\u0010\u0004R\u001f\u0010¾\u0001\u001a\u00020q8\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b¼\u0001\u0010¼\u0001\u001a\u0006\b¢\u0001\u0010½\u0001R\u001d\u0010¿\u0001\u001a\u0004\u0018\u00010q8\u0016X\u0097\u0004¢\u0006\f\n\u0004\bl\u0010s\u001a\u0004\bA\u0010uR'\u0010Ä\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010À\u00018\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\bi\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\"\u0010Ê\u0001\u001a\u0005\u0018\u00010Å\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R!\u0010Ï\u0001\u001a\u0005\u0018\u00010Ë\u00018\u0016X\u0097\u0004¢\u0006\u000f\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0005\b3\u0010Î\u0001R\u001f\u0010Ò\u0001\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÐ\u0001\u0010\"\u001a\u0005\bÑ\u0001\u0010$R\u001f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0006\u001a\u0005\bÓ\u0001\u0010\u0004R\"\u0010Ù\u0001\u001a\u0005\u0018\u00010Õ\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bÖ\u0001\u0010×\u0001\u001a\u0006\b\u0080\u0001\u0010Ø\u0001R!\u0010Þ\u0001\u001a\u0005\u0018\u00010Ú\u00018\u0016X\u0097\u0004¢\u0006\u000f\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0005\b\u0017\u0010Ý\u0001R\"\u0010ä\u0001\u001a\u0005\u0018\u00010ß\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001R\"\u0010ê\u0001\u001a\u0005\u0018\u00010å\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0006\bè\u0001\u0010é\u0001R!\u0010î\u0001\u001a\u0005\u0018\u00010ë\u00018\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b\u0007\u0010ì\u0001\u001a\u0006\bÖ\u0001\u0010í\u0001R\u001f\u0010ñ\u0001\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bï\u0001\u0010\u0006\u001a\u0005\bð\u0001\u0010\u0004R\u001f\u0010ô\u0001\u001a\u0004\u0018\u00010q8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bò\u0001\u0010s\u001a\u0005\bó\u0001\u0010uR\"\u0010ú\u0001\u001a\u0005\u0018\u00010õ\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001R\u001f\u0010ý\u0001\u001a\u0004\u0018\u00010q8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bû\u0001\u0010s\u001a\u0005\bü\u0001\u0010uR\"\u0010\u0082\u0002\u001a\u0005\u0018\u00010þ\u00018\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bÿ\u0001\u0010\u0080\u0002\u001a\u0006\b¼\u0001\u0010\u0081\u0002R!\u0010\u0087\u0002\u001a\u0005\u0018\u00010\u0083\u00028\u0016X\u0097\u0004¢\u0006\u000f\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0005\b\u001b\u0010\u0086\u0002R!\u0010\u008c\u0002\u001a\u0005\u0018\u00010\u0088\u00028\u0016X\u0097\u0004¢\u0006\u000f\n\u0006\b\u0089\u0002\u0010\u008a\u0002\u001a\u0005\b<\u0010\u008b\u0002R!\u0010\u0090\u0002\u001a\u0005\u0018\u00010\u008d\u00028\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b\n\u0010\u008e\u0002\u001a\u0006\bæ\u0001\u0010\u008f\u0002R\u001e\u0010\u0092\u0002\u001a\u0004\u0018\u00010q8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b\u0091\u0002\u0010s\u001a\u0004\b>\u0010uR\u001f\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bø\u0001\u0010\u0006\u001a\u0005\b\u0093\u0002\u0010\u0004R\u001f\u0010\u0097\u0002\u001a\u0004\u0018\u00010q8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0095\u0002\u0010s\u001a\u0005\b\u0096\u0002\u0010uR\"\u0010\u009c\u0002\u001a\u0005\u0018\u00010\u0098\u00028\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bè\u0001\u0010\u0099\u0002\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R!\u0010 \u0002\u001a\u0005\u0018\u00010\u009d\u00028\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\bS\u0010\u009e\u0002\u001a\u0006\bö\u0001\u0010\u009f\u0002R\u001f\u0010¢\u0002\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÂ\u0001\u0010\u0006\u001a\u0005\b¡\u0002\u0010\u0004R\u001d\u0010£\u0002\u001a\u0004\u0018\u00010q8\u0016X\u0097\u0004¢\u0006\f\n\u0004\ba\u0010s\u001a\u0004\bP\u0010uR\u001e\u0010¤\u0002\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\r\n\u0005\b\u009a\u0002\u0010\u0006\u001a\u0004\bR\u0010\u0004R\u001e\u0010¥\u0002\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\r\n\u0005\bâ\u0001\u0010\"\u001a\u0004\bU\u0010$R\"\u0010©\u0002\u001a\u0005\u0018\u00010¦\u00028\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b¡\u0002\u0010§\u0002\u001a\u0006\b\u009e\u0001\u0010¨\u0002R!\u0010\u00ad\u0002\u001a\u0005\u0018\u00010ª\u00028\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\bt\u0010«\u0002\u001a\u0006\b\u0084\u0002\u0010¬\u0002R\"\u0010³\u0002\u001a\u0005\u0018\u00010®\u00028\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b¯\u0002\u0010°\u0002\u001a\u0006\b±\u0002\u0010²\u0002R\u001f\u0010¶\u0002\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b´\u0002\u0010\u0006\u001a\u0005\bµ\u0002\u0010\u0004R\u001e\u0010¸\u0002\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\r\n\u0005\b·\u0002\u0010\u0006\u001a\u0004\bH\u0010\u0004R!\u0010½\u0002\u001a\u0005\u0018\u00010¹\u00028\u0016X\u0097\u0004¢\u0006\u000f\n\u0006\bº\u0002\u0010»\u0002\u001a\u0005\bY\u0010¼\u0002R\"\u0010Â\u0002\u001a\u0005\u0018\u00010¾\u00028\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b¿\u0002\u0010À\u0002\u001a\u0006\bï\u0001\u0010Á\u0002R\"\u0010Ç\u0002\u001a\u0005\u0018\u00010Ã\u00028\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bÄ\u0002\u0010Å\u0002\u001a\u0006\bÿ\u0001\u0010Æ\u0002R!\u0010Ì\u0002\u001a\u0005\u0018\u00010È\u00028\u0016X\u0097\u0004¢\u0006\u000f\n\u0006\bÉ\u0002\u0010Ê\u0002\u001a\u0005\b_\u0010Ë\u0002R\u001f\u0010Î\u0002\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÍ\u0002\u0010\u0006\u001a\u0005\b¿\u0002\u0010\u0004R\u001f\u0010Ñ\u0002\u001a\u0004\u0018\u00010q8\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÏ\u0002\u0010s\u001a\u0005\bÐ\u0002\u0010uR\u001e\u0010Ó\u0002\u001a\u0004\u0018\u00010X8\u0016X\u0097\u0004¢\u0006\r\n\u0005\bÒ\u0002\u0010Z\u001a\u0004\b\t\u0010\\R\u001f\u0010Ö\u0002\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÔ\u0002\u0010\u0006\u001a\u0005\bÕ\u0002\u0010\u0004R!\u0010Û\u0002\u001a\u0005\u0018\u00010×\u00028\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\bo\u0010Ø\u0002\u001a\u0006\bÙ\u0002\u0010Ú\u0002R\u001f\u0010Þ\u0002\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÜ\u0002\u0010\u0006\u001a\u0005\bÝ\u0002\u0010\u0004R\"\u0010ã\u0002\u001a\u0005\u0018\u00010ß\u00028\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b¤\u0001\u0010à\u0002\u001a\u0006\bá\u0002\u0010â\u0002R\"\u0010ç\u0002\u001a\u0005\u0018\u00010ä\u00028\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bÐ\u0002\u0010å\u0002\u001a\u0006\bº\u0002\u0010æ\u0002R\u001d\u0010è\u0002\u001a\u0004\u0018\u00010q8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b[\u0010s\u001a\u0004\by\u0010uR\"\u0010í\u0002\u001a\u0005\u0018\u00010é\u00028\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bÑ\u0001\u0010ê\u0002\u001a\u0006\bë\u0002\u0010ì\u0002R\"\u0010ñ\u0002\u001a\u0005\u0018\u00010î\u00028\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bÓ\u0001\u0010ï\u0002\u001a\u0006\bÜ\u0002\u0010ð\u0002R!\u0010õ\u0002\u001a\u0005\u0018\u00010ò\u00028\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\bB\u0010ó\u0002\u001a\u0006\bò\u0001\u0010ô\u0002R\"\u0010ù\u0002\u001a\u0005\u0018\u00010ö\u00028\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010÷\u0002\u001a\u0006\bÆ\u0001\u0010ø\u0002R\"\u0010û\u0002\u001a\u0005\u0018\u00010ö\u00028\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bÝ\u0002\u0010÷\u0002\u001a\u0006\bú\u0002\u0010ø\u0002R!\u0010ÿ\u0002\u001a\u0005\u0018\u00010ü\u00028\u0016X\u0097\u0004¢\u0006\u000f\n\u0006\bá\u0002\u0010ý\u0002\u001a\u0005\b!\u0010þ\u0002R \u0010\u0083\u0003\u001a\u0005\u0018\u00010\u0080\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\r\u0010\u0081\u0003\u001a\u0005\b&\u0010\u0082\u0003R!\u0010\u0088\u0003\u001a\u0005\u0018\u00010\u0084\u00038\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\bN\u0010\u0085\u0003\u001a\u0006\b\u0086\u0003\u0010\u0087\u0003R\u001e\u0010\u008a\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\r\n\u0004\bV\u0010\u0006\u001a\u0005\b\u0089\u0003\u0010\u0004R\u001f\u0010\u008c\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u008b\u0003\u0010\u0006\u001a\u0005\b§\u0001\u0010\u0004R\u001f\u0010\u008e\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bó\u0001\u0010\u0006\u001a\u0005\b\u008d\u0003\u0010\u0004R!\u0010\u0092\u0003\u001a\u0005\u0018\u00010\u008f\u00038\u0016X\u0097\u0004¢\u0006\u000f\n\u0006\b\u009f\u0001\u0010\u0090\u0003\u001a\u0005\b\f\u0010\u0091\u0003R\u001e\u0010\u0093\u0003\u001a\u0004\u0018\u00010q8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b±\u0002\u0010s\u001a\u0004\b\u000f\u0010uR\u001e\u0010\u0095\u0003\u001a\u0004\u0018\u00010q8\u0016X\u0097\u0004¢\u0006\r\n\u0005\b\u0094\u0003\u0010s\u001a\u0004\b6\u0010uR\u001f\u0010\u0096\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0086\u0003\u0010\u0006\u001a\u0005\bÔ\u0002\u0010\u0004R\u001f\u0010\u0097\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0006\u001a\u0005\b\u0095\u0002\u0010\u0004R!\u0010\u009c\u0003\u001a\u0005\u0018\u00010\u0098\u00038\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b\u001c\u0010\u0099\u0003\u001a\u0006\b\u009a\u0003\u0010\u009b\u0003R!\u0010¡\u0003\u001a\u0005\u0018\u00010\u009d\u00038\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b\u0013\u0010\u009e\u0003\u001a\u0006\b\u009f\u0003\u0010 \u0003R\u001f\u0010¢\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bë\u0002\u0010\u0006\u001a\u0005\bÛ\u0001\u0010\u0004R\"\u0010¦\u0003\u001a\u0005\u0018\u00010£\u00038\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b\u0090\u0001\u0010¤\u0003\u001a\u0006\b\u0091\u0002\u0010¥\u0003R!\u0010ª\u0003\u001a\u0005\u0018\u00010§\u00038\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b:\u0010¨\u0003\u001a\u0006\bÉ\u0002\u0010©\u0003R\"\u0010®\u0003\u001a\u0005\u0018\u00010«\u00038\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b\u009f\u0003\u0010¬\u0003\u001a\u0006\b\u0094\u0001\u0010\u00ad\u0003R\u001f\u0010¯\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bú\u0002\u0010\u0006\u001a\u0005\b¶\u0001\u0010\u0004R\u001f\u0010°\u0003\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0093\u0002\u0010\"\u001a\u0005\b¯\u0002\u0010$R\u001f\u0010±\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0089\u0003\u0010\u0006\u001a\u0005\b´\u0002\u0010\u0004R\u001f\u0010²\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u009a\u0003\u0010\u0006\u001a\u0005\bÒ\u0002\u0010\u0004R!\u0010¶\u0003\u001a\u0005\u0018\u00010³\u00038\u0016X\u0097\u0004¢\u0006\u000f\n\u0005\b7\u0010´\u0003\u001a\u0006\bÄ\u0002\u0010µ\u0003R\"\u0010º\u0003\u001a\u0005\u0018\u00010·\u00038\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bª\u0001\u0010¸\u0003\u001a\u0006\b\u00ad\u0001\u0010¹\u0003R\u001e\u0010¼\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\r\n\u0005\b»\u0003\u0010\u0006\u001a\u0004\bn\u0010\u0004R\u001f\u0010½\u0003\u001a\u0004\u0018\u00010\u00158\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bð\u0001\u0010\"\u001a\u0005\bÐ\u0001\u0010$R\u001f\u0010¾\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bü\u0001\u0010\u0006\u001a\u0005\bÌ\u0001\u0010\u0004R\u001e\u0010¿\u0003\u001a\u0004\u0018\u00010q8\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u0010\u0010s\u001a\u0005\b\u0094\u0003\u0010uR\u001f\u0010À\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u008d\u0003\u0010\u0006\u001a\u0005\b·\u0002\u0010\u0004R\u001e\u0010Á\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u001f\u0010\u0006\u001a\u0005\bÏ\u0002\u0010\u0004R\u001f\u0010Â\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bµ\u0002\u0010\u0006\u001a\u0005\b\u0089\u0002\u0010\u0004R\u001f\u0010Ã\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÈ\u0001\u0010\u0006\u001a\u0005\b\u008b\u0003\u0010\u0004R\u001f\u0010Ä\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÕ\u0002\u0010\u0006\u001a\u0005\bÍ\u0002\u0010\u0004R\"\u0010È\u0003\u001a\u0005\u0018\u00010Å\u00038\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bÙ\u0002\u0010Æ\u0003\u001a\u0006\b\u0089\u0001\u0010Ç\u0003R\"\u0010Ì\u0003\u001a\u0005\u0018\u00010É\u00038\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\b\u0096\u0002\u0010Ê\u0003\u001a\u0006\b»\u0003\u0010Ë\u0003R\"\u0010Ñ\u0003\u001a\u0005\u0018\u00010Í\u00038\u0016X\u0097\u0004¢\u0006\u0010\n\u0006\bÎ\u0003\u0010Ï\u0003\u001a\u0006\bà\u0001\u0010Ð\u0003¨\u0006Ò\u0003"}, d2 = {"Lxhf/d1;", "Lxhf/h;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "k0", "id", "b", "s0", "legId", "c", "a1", "registeredIdentityId", "d", "z1", "type", "e", "l1", "state", "", "f", "J", "H", "()J", "createdDate", "g", "k1", "startedDate", "h", "B1", "updatedDate", "i", "Ljava/lang/Long;", "D", "()Ljava/lang/Long;", "completedDate", "j", "L", "currency", "k", "amount", "l", "amountWithCharges", "m", "Y", "feeBreakdownId", "n", "X", "fee", "o", "V", "exchangeFee", "p", "u1", "transferFee", "q", "o1", "surcharge", "r", "balance", "s", "N", "description", "t", "W0", "reason", "u", "C", "comment", "Lxhf/q1;", "v", "Lxhf/q1;", "getRatings", "()Lxhf/q1;", "ratings", "w", "b1", "rejectComment", "x", "category", "y", "x0", "logo", "z", "c1", "relatedTransactionId", "", "A", "Ljava/lang/Double;", "T0", "()Ljava/lang/Double;", "rate", "Lxhf/m1;", "B", "Lxhf/m1;", "z0", "()Lxhf/m1;", "merchant", "Lxhf/w0;", "Lxhf/w0;", "getCard", "()Lxhf/w0;", "card", "b0", "fraudState", "E", "a0", "fraudReason", "F", "P0", "posTime", "", "G", "Ljava/lang/Boolean;", "D0", "()Ljava/lang/Boolean;", "offline", "cashbackBoxId", "Lxhf/p0;", "I", "Lxhf/p0;", "()Lxhf/p0;", "account", "P", "direction", "Lxhf/z0;", "K", "Lxhf/z0;", "()Lxhf/z0;", "counterpart", "Lxhf/q0;", "Lxhf/q0;", "()Lxhf/q0;", "autoInvest", "Lxhf/a2;", "M", "Lxhf/a2;", "j1", "()Lxhf/a2;", "standingOrder", "Lxhf/d2;", "Lxhf/d2;", "n1", "()Lxhf/d2;", "stopOrder", "Lxhf/g1;", "O", "Lxhf/g1;", "getInsurance", "()Lxhf/g1;", "insurance", "Lxhf/g2;", "Lxhf/g2;", "X0", "()Lxhf/g2;", "recipient", "Q", "f1", "sender", "Lxhf/p1;", "R", "Lxhf/p1;", "R0", "()Lxhf/p1;", "profusion", "S", "T", "entryMode", "v1", "transferLinkId", "Lxhf/s0;", "U", "Lxhf/s0;", "getBeneficiary", "()Lxhf/s0;", "beneficiary", "Lxhf/t0;", "Lxhf/t0;", "()Lxhf/t0;", "beneficiaryFee", "W", "getAliasBeneficiary", "aliasBeneficiary", "f0", "gif", "countryCode", "Z", "()Z", "ecommerce", "cardholderPresent", "", "Ljava/util/List;", "y0", "()Ljava/util/List;", "loungePassIds", "Lxhf/h2;", "c0", "Lxhf/h2;", "D1", "()Lxhf/h2;", "vault", "Lxhf/u0;", "d0", "Lxhf/u0;", "()Lxhf/u0;", "billAccount", "e0", "U0", "rateMarkupAmount", "V0", "rateMarkupAmountCurrency", "Lxhf/t;", "g0", "Lxhf/t;", "()Lxhf/t;", "cryptoWithdrawDetails", "Lxhf/r;", "h0", "Lxhf/r;", "()Lxhf/r;", "cryptoDepositDetails", "Lxhf/x1;", "i0", "Lxhf/x1;", "B0", "()Lxhf/x1;", "moneyRequest", "Lxhf/i1;", "j0", "Lxhf/i1;", "w0", "()Lxhf/i1;", "localisedDescription", "Lxhf/f1;", "Lxhf/f1;", "()Lxhf/f1;", "gift", "l0", "x1", "transferType", "m0", "e1", "savingsVaultsBonus", "Lxhf/i0;", "n0", "Lxhf/i0;", "u0", "()Lxhf/i0;", "loanRepayment", "o0", "y1", "transparentPricing", "Lxhf/x;", "p0", "Lxhf/x;", "()Lxhf/x;", "feesBreakdown", "Lxhf/c;", "q0", "Lxhf/c;", "()Lxhf/c;", "amountBreakdown", "Lxhf/k;", "r0", "Lxhf/k;", "()Lxhf/k;", "cardOwner", "Lxhf/b0;", "Lxhf/b0;", "()Lxhf/b0;", "hotelBooking", "t0", "cardVerification", "r1", "topupMethod", "v0", "G1", "isBusinessTransaction", "Lxhf/o1;", "Lxhf/o1;", "A0", "()Lxhf/o1;", "merchantPayment", "Lxhf/e0;", "Lxhf/e0;", "()Lxhf/e0;", "instalmentPlan", "C0", "note", "chargebackEligible", "chargebackState", "chargebackUpdatedDate", "Lxhf/c1;", "Lxhf/c1;", "()Lxhf/c1;", "doxgetyReward", "Lxhf/h1;", "Lxhf/h1;", "()Lxhf/h1;", "junior", "Lxhf/w1;", "E0", "Lxhf/w1;", "g1", "()Lxhf/w1;", "shops", "F0", "C1", "userOfferId", "G0", "cashbackType", "Lxhf/y0;", "H0", "Lxhf/y0;", "()Lxhf/y0;", "charity", "Lxhf/d0;", "I0", "Lxhf/d0;", "()Lxhf/d0;", "initiatedBy", "Lxhf/f0;", "J0", "Lxhf/f0;", "()Lxhf/f0;", "joint", "Lxhf/l;", "K0", "Lxhf/l;", "()Lxhf/l;", "collectionTrading", "L0", "payerName", "M0", "S0", "provisionalRefund", "N0", "accruedLoyaltyPointsAmount", "O0", "E1", "warrantReason", "Lxhf/i2;", "Lxhf/i2;", "F1", "()Lxhf/i2;", "wealthPortfolio", "Q0", "Y0", "referralInviteId", "Lxhf/s1;", "Lxhf/s1;", "Z0", "()Lxhf/s1;", "referralReward", "Lxhf/m0;", "Lxhf/m0;", "()Lxhf/m0;", "paidPlanTransactionInfo", "creditCardCashbackCollection", "Lxhf/o;", "Lxhf/o;", "m1", "()Lxhf/o;", "statementDeferralInstalment", "Lxhf/n;", "Lxhf/n;", "()Lxhf/n;", "prePurchaseInstalment", "Lxhf/m;", "Lxhf/m;", "()Lxhf/m;", "instalmentInfo", "Lxhf/a;", "Lxhf/a;", "()Lxhf/a;", "fromAccount", "q1", "toAccount", "Lxhf/d;", "Lxhf/d;", "()Lxhf/d;", "apmContact", "Lxhf/e;", "Lxhf/e;", "()Lxhf/e;", "apmInfo", "Lxhf/z1;", "Lxhf/z1;", "i1", "()Lxhf/z1;", "stakingInfo", "s1", "topupSource", "d1", "edt", "A1", "unblockDate", "Lyhf/a;", "Lyhf/a;", "()Lyhf/a;", "acquiringCashback", "acquiringTaxPayment", "h1", "canBeMarkedAsSubscription", "paymentScheme", "localInstrument", "Lxhf/x0;", "Lxhf/x0;", "t1", "()Lxhf/x0;", "transactionCharges", "Lxhf/e2;", "Lxhf/e2;", "p1", "()Lxhf/e2;", "taxDetails", "groupKey", "Lxhf/h0;", "Lxhf/h0;", "()Lxhf/h0;", "linkedExchangeDetails", "Lxhf/o0;", "Lxhf/o0;", "()Lxhf/o0;", "paymentCounterparty", "Lxhf/a1;", "Lxhf/a1;", "()Lxhf/a1;", "digitizedCard", "externalRegulator", "originalAmount", "originalCurrency", "paymentMethod", "Lxhf/n0;", "Lxhf/n0;", "()Lxhf/n0;", "paymentAuthorisation", "Lxhf/v;", "Lxhf/v;", "()Lxhf/v;", "equivalent", "w1", "counterpartyDetailsGroup", "fundsTransferExpireTimeMillis", "fundingStatus", "splittable", "p2pPersonalisationId", "paymentLinkId", "ledgerOrigin", "rewardReason", "paymentInitiationType", "Lyhf/h;", "Lyhf/h;", "()Lyhf/h;", "defiMetadata", "Lgsf/m;", "Lgsf/m;", "()Lgsf/m;", "transferReasons", "Lxhf/a0;", "H1", "Lxhf/a0;", "()Lxhf/a0;", "guardian", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d1 extends h {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @lg.b("rate")
    private final Double rate;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    @lg.b("chargebackState")
    private final String chargebackState;

    /* JADX INFO: renamed from: A1, reason: from kotlin metadata */
    @lg.b("p2pPersonalisationId")
    private final String p2pPersonalisationId;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @lg.b("merchant")
    private final m1 merchant;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    @lg.b("chargebackUpdatedDate")
    private final Long chargebackUpdatedDate;

    /* JADX INFO: renamed from: B1, reason: from kotlin metadata */
    @lg.b("paymentLinkId")
    private final String paymentLinkId;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @lg.b("card")
    private final w0 card;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    @lg.b("doxgetyReward")
    private final c1 doxgetyReward;

    /* JADX INFO: renamed from: C1, reason: from kotlin metadata */
    @lg.b("ledgerOrigin")
    private final String ledgerOrigin;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @lg.b("fraudState")
    private final String fraudState;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    @lg.b("junior")
    private final h1 junior;

    /* JADX INFO: renamed from: D1, reason: from kotlin metadata */
    @lg.b("rewardReason")
    private final String rewardReason;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @lg.b("fraudReason")
    private final String fraudReason;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @lg.b("shops")
    private final w1 shops;

    /* JADX INFO: renamed from: E1, reason: from kotlin metadata */
    @lg.b("paymentInitiationType")
    private final String paymentInitiationType;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @lg.b("posTime")
    private final Long posTime;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @lg.b("userOfferId")
    private final String userOfferId;

    /* JADX INFO: renamed from: F1, reason: from kotlin metadata */
    @lg.b("defiMetadata")
    private final yhf.h defiMetadata;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @lg.b("offline")
    private final Boolean offline;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    @lg.b("cashbackType")
    private final String cashbackType;

    /* JADX INFO: renamed from: G1, reason: from kotlin metadata */
    @lg.b("transferReasons")
    private final gsf.m transferReasons;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @lg.b("cashbackBoxId")
    private final String cashbackBoxId;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @lg.b("charity")
    private final y0 charity;

    /* JADX INFO: renamed from: H1, reason: from kotlin metadata */
    @lg.b("guardian")
    private final a0 guardian;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @lg.b("account")
    @NotNull
    private final p0 account;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    @lg.b("initiatedBy")
    private final d0 initiatedBy;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @lg.b("direction")
    private final String direction;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    @lg.b("joint")
    private final f0 joint;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @lg.b("counterpart")
    private final z0 counterpart;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    @lg.b("collectionTrading")
    private final l collectionTrading;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @lg.b("autoInvest")
    private final q0 autoInvest;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    @lg.b("payerName")
    private final String payerName;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @lg.b("standingOrder")
    private final a2 standingOrder;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    @lg.b("provisionalRefund")
    private final Boolean provisionalRefund;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @lg.b("stopOrder")
    private final d2 stopOrder;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @lg.b("accruedLoyaltyPointsAmount")
    private final Double accruedLoyaltyPointsAmount;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @lg.b("insurance")
    private final g1 insurance;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    @lg.b("warrantReason")
    private final String warrantReason;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @lg.b("recipient")
    private final g2 recipient;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    @lg.b("trading")
    private final i2 wealthPortfolio;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @lg.b("sender")
    private final g2 sender;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @lg.b("referralInviteId")
    private final String referralInviteId;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @lg.b("profusion")
    private final p1 profusion;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    @lg.b("referralReward")
    private final s1 referralReward;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @lg.b("entryMode")
    private final String entryMode;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @lg.b("paidPlanTransactionInfo")
    private final m0 paidPlanTransactionInfo;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @lg.b("transferLinkId")
    private final String transferLinkId;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @lg.b("creditCardCashbackCollection")
    private final Boolean creditCardCashbackCollection;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @lg.b("beneficiary")
    private final s0 beneficiary;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @lg.b("statementDeferralInstalment")
    private final o statementDeferralInstalment;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @lg.b("beneficiaryFee")
    private final t0 beneficiaryFee;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @lg.b("prePurchaseInstalment")
    private final n prePurchaseInstalment;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @lg.b("aliasBeneficiary")
    private final s0 aliasBeneficiary;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    @lg.b("instalmentInfo")
    private final m instalmentInfo;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @lg.b("gif")
    private final String gif;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    @lg.b("fromAccount")
    private final a fromAccount;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @lg.b("countryCode")
    private final String countryCode;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    @lg.b("toAccount")
    private final a toAccount;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @lg.b("eCommerce")
    private final boolean ecommerce;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    @lg.b("contact")
    private final d apmContact;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardholderPresent")
    private final Boolean cardholderPresent;

    /* JADX INFO: renamed from: a1, reason: from kotlin metadata */
    @lg.b("apm")
    private final e apmInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("legId")
    @NotNull
    private final String legId;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @lg.b("loungePassIds")
    private final List<String> loungePassIds;

    /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
    @lg.b("staking")
    private final z1 stakingInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("registeredIdentityId")
    private final String registeredIdentityId;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    @lg.b("vault")
    private final h2 vault;

    /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
    @lg.b("topupSource")
    private final String topupSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    @lg.b("billMoneyBox")
    private final u0 billAccount;

    /* JADX INFO: renamed from: d1, reason: collision with root package name and from kotlin metadata */
    @lg.b("edt")
    private final String edt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    @lg.b("rateMarkupAmount")
    private final Long rateMarkupAmount;

    /* JADX INFO: renamed from: e1, reason: collision with root package name and from kotlin metadata */
    @lg.b("unblockDate")
    private final String unblockDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    @lg.b("rateMarkupAmountCurrency")
    private final String rateMarkupAmountCurrency;

    /* JADX INFO: renamed from: f1, reason: collision with root package name and from kotlin metadata */
    @lg.b("acquiringCashback")
    private final yhf.a acquiringCashback;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("startedDate")
    private final long startedDate;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    @lg.b("cryptoWithdrawDetails")
    private final t cryptoWithdrawDetails;

    /* JADX INFO: renamed from: g1, reason: collision with root package name and from kotlin metadata */
    @lg.b("acquiringTaxPayment")
    private final Boolean acquiringTaxPayment;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedDate")
    private final long updatedDate;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    @lg.b("cryptoDepositDetails")
    private final r cryptoDepositDetails;

    /* JADX INFO: renamed from: h1, reason: collision with root package name and from kotlin metadata */
    @lg.b("canBeMarkedAsSubscription")
    private final Boolean canBeMarkedAsSubscription;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("completedDate")
    private final Long completedDate;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    @lg.b("moneyRequest")
    private final x1 moneyRequest;

    /* JADX INFO: renamed from: i1, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentScheme")
    private final String paymentScheme;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    @lg.b("localisedDescription")
    private final i1 localisedDescription;

    /* JADX INFO: renamed from: j1, reason: collision with root package name and from kotlin metadata */
    @lg.b("localInstrument")
    private final String localInstrument;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    @lg.b("gift")
    private final f1 gift;

    /* JADX INFO: renamed from: k1, reason: collision with root package name and from kotlin metadata */
    @lg.b("charges")
    private final x0 transactionCharges;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("amountWithCharges")
    private final long amountWithCharges;

    /* JADX INFO: renamed from: l0, reason: from kotlin metadata */
    @lg.b("transferType")
    private final String transferType;

    /* JADX INFO: renamed from: l1, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxDetails")
    private final e2 taxDetails;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("feeBreakdownId")
    private final String feeBreakdownId;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    @lg.b("savingsVaultsBonus")
    private final Boolean savingsVaultsBonus;

    /* JADX INFO: renamed from: m1, reason: from kotlin metadata */
    @lg.b("groupKey")
    private final String groupKey;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    private final long fee;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    @lg.b("loanRepayment")
    private final i0 loanRepayment;

    /* JADX INFO: renamed from: n1, reason: collision with root package name and from kotlin metadata */
    @lg.b("linkedExchangeDetails")
    private final h0 linkedExchangeDetails;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("exchangeFee")
    private final long exchangeFee;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    @lg.b("transparentPricing")
    private final Boolean transparentPricing;

    /* JADX INFO: renamed from: o1, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentCounterparty")
    private final o0 paymentCounterparty;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("transferFee")
    private final long transferFee;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    @lg.b("feesBreakdown")
    private final x feesBreakdown;

    /* JADX INFO: renamed from: p1, reason: collision with root package name and from kotlin metadata */
    @lg.b("digitizedCard")
    private final a1 digitizedCard;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("surcharge")
    private final Long surcharge;

    /* JADX INFO: renamed from: q0, reason: from kotlin metadata */
    @lg.b("amountBreakdown")
    private final c amountBreakdown;

    /* JADX INFO: renamed from: q1, reason: from kotlin metadata */
    @lg.b("externalRegulator")
    private final String externalRegulator;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("balance")
    private final Long balance;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardOwner")
    private final k cardOwner;

    /* JADX INFO: renamed from: r1, reason: collision with root package name and from kotlin metadata */
    @lg.b("originalAmount")
    private final Long originalAmount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @lg.b("hotelBooking")
    private final b0 hotelBooking;

    /* JADX INFO: renamed from: s1, reason: collision with root package name and from kotlin metadata */
    @lg.b("originalCurrency")
    private final String originalCurrency;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final String reason;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardVerification")
    private final Boolean cardVerification;

    /* JADX INFO: renamed from: t1, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentMethod")
    private final String paymentMethod;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @lg.b("comment")
    private final String comment;

    /* JADX INFO: renamed from: u0, reason: from kotlin metadata */
    @lg.b("topupMethod")
    private final String topupMethod;

    /* JADX INFO: renamed from: u1, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentAuthorisation")
    private final n0 paymentAuthorisation;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @lg.b("ratings")
    private final q1 ratings;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    @lg.b("isProEligible")
    private final Boolean isBusinessTransaction;

    /* JADX INFO: renamed from: v1, reason: collision with root package name and from kotlin metadata */
    @lg.b("equivalent")
    private final v equivalent;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @lg.b("rejectComment")
    private final String rejectComment;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchantPayment")
    private final o1 merchantPayment;

    /* JADX INFO: renamed from: w1, reason: from kotlin metadata */
    @lg.b("counterpartyDetailsGroup")
    private final String counterpartyDetailsGroup;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @lg.b("category")
    @NotNull
    private final String category;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @lg.b("instalmentPlan")
    private final e0 instalmentPlan;

    /* JADX INFO: renamed from: x1, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundsTransferExpireTime")
    private final Long fundsTransferExpireTimeMillis;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @lg.b("logo")
    private final String logo;

    /* JADX INFO: renamed from: y0, reason: from kotlin metadata */
    @lg.b("note")
    private final String note;

    /* JADX INFO: renamed from: y1, reason: collision with root package name and from kotlin metadata */
    @lg.b("fundingStatus")
    private final String fundingStatus;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @lg.b("relatedTransactionId")
    private final String relatedTransactionId;

    /* JADX INFO: renamed from: z0, reason: from kotlin metadata */
    @lg.b("chargebackEligible")
    private final Boolean chargebackEligible;

    /* JADX INFO: renamed from: z1, reason: collision with root package name and from kotlin metadata */
    @lg.b("splittable")
    private final Boolean splittable;

    @Override // xhf.h
    /* JADX INFO: renamed from: A, reason: from getter */
    public final y0 getCharity() {
        return this.charity;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: A0, reason: from getter */
    public final o1 getMerchantPayment() {
        return this.merchantPayment;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: A1, reason: from getter */
    public final String getUnblockDate() {
        return this.unblockDate;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: B, reason: from getter */
    public final l getCollectionTrading() {
        return this.collectionTrading;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: B0, reason: from getter */
    public final x1 getMoneyRequest() {
        return this.moneyRequest;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: B1, reason: from getter */
    public final long getUpdatedDate() {
        return this.updatedDate;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: C, reason: from getter */
    public final String getComment() {
        return this.comment;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: C0, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: C1, reason: from getter */
    public final String getUserOfferId() {
        return this.userOfferId;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: D, reason: from getter */
    public final Long getCompletedDate() {
        return this.completedDate;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: D0, reason: from getter */
    public final Boolean getOffline() {
        return this.offline;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: D1, reason: from getter */
    public final h2 getVault() {
        return this.vault;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: E, reason: from getter */
    public final z0 getCounterpart() {
        return this.counterpart;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: E0, reason: from getter */
    public final Long getOriginalAmount() {
        return this.originalAmount;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: E1, reason: from getter */
    public final String getWarrantReason() {
        return this.warrantReason;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: F, reason: from getter */
    public final String getCounterpartyDetailsGroup() {
        return this.counterpartyDetailsGroup;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: F0, reason: from getter */
    public final String getOriginalCurrency() {
        return this.originalCurrency;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: F1, reason: from getter */
    public final i2 getWealthPortfolio() {
        return this.wealthPortfolio;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: G0, reason: from getter */
    public final String getP2pPersonalisationId() {
        return this.p2pPersonalisationId;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: G1, reason: from getter */
    public final Boolean getIsBusinessTransaction() {
        return this.isBusinessTransaction;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: H, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final m0 getPaidPlanTransactionInfo() {
        return this.paidPlanTransactionInfo;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: I, reason: from getter */
    public final Boolean getCreditCardCashbackCollection() {
        return this.creditCardCashbackCollection;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: I0, reason: from getter */
    public final String getPayerName() {
        return this.payerName;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: J, reason: from getter */
    public final r getCryptoDepositDetails() {
        return this.cryptoDepositDetails;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: J0, reason: from getter */
    public final n0 getPaymentAuthorisation() {
        return this.paymentAuthorisation;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: K, reason: from getter */
    public final t getCryptoWithdrawDetails() {
        return this.cryptoWithdrawDetails;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: K0, reason: from getter */
    public final o0 getPaymentCounterparty() {
        return this.paymentCounterparty;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: L, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: L0, reason: from getter */
    public final String getPaymentInitiationType() {
        return this.paymentInitiationType;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: M, reason: from getter */
    public final yhf.h getDefiMetadata() {
        return this.defiMetadata;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: M0, reason: from getter */
    public final String getPaymentLinkId() {
        return this.paymentLinkId;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: N, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: N0, reason: from getter */
    public final String getPaymentMethod() {
        return this.paymentMethod;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: O, reason: from getter */
    public final a1 getDigitizedCard() {
        return this.digitizedCard;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: O0, reason: from getter */
    public final String getPaymentScheme() {
        return this.paymentScheme;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: P, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: P0, reason: from getter */
    public final Long getPosTime() {
        return this.posTime;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final c1 getDoxgetyReward() {
        return this.doxgetyReward;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: Q0, reason: from getter */
    public final n getPrePurchaseInstalment() {
        return this.prePurchaseInstalment;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: R, reason: from getter */
    public final boolean getEcommerce() {
        return this.ecommerce;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: R0, reason: from getter */
    public final p1 getProfusion() {
        return this.profusion;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: S, reason: from getter */
    public final String getEdt() {
        return this.edt;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: S0, reason: from getter */
    public final Boolean getProvisionalRefund() {
        return this.provisionalRefund;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: T, reason: from getter */
    public final String getEntryMode() {
        return this.entryMode;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: T0, reason: from getter */
    public final Double getRate() {
        return this.rate;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: U, reason: from getter */
    public final v getEquivalent() {
        return this.equivalent;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: U0, reason: from getter */
    public final Long getRateMarkupAmount() {
        return this.rateMarkupAmount;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: V, reason: from getter */
    public final long getExchangeFee() {
        return this.exchangeFee;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: V0, reason: from getter */
    public final String getRateMarkupAmountCurrency() {
        return this.rateMarkupAmountCurrency;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: W, reason: from getter */
    public final String getExternalRegulator() {
        return this.externalRegulator;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: W0, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: X, reason: from getter */
    public final long getFee() {
        return this.fee;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: X0, reason: from getter */
    public final g2 getRecipient() {
        return this.recipient;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: Y, reason: from getter */
    public final String getFeeBreakdownId() {
        return this.feeBreakdownId;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final String getReferralInviteId() {
        return this.referralInviteId;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: Z, reason: from getter */
    public final x getFeesBreakdown() {
        return this.feesBreakdown;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: Z0, reason: from getter */
    public final s1 getReferralReward() {
        return this.referralReward;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: a, reason: from getter */
    public final p0 getAccount() {
        return this.account;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: a0, reason: from getter */
    public final String getFraudReason() {
        return this.fraudReason;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: a1, reason: from getter */
    public final String getRegisteredIdentityId() {
        return this.registeredIdentityId;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getAccruedLoyaltyPointsAmount() {
        return this.accruedLoyaltyPointsAmount;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: b0, reason: from getter */
    public final String getFraudState() {
        return this.fraudState;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: b1, reason: from getter */
    public final String getRejectComment() {
        return this.rejectComment;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: c, reason: from getter */
    public final yhf.a getAcquiringCashback() {
        return this.acquiringCashback;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: c0, reason: from getter */
    public final a getFromAccount() {
        return this.fromAccount;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: c1, reason: from getter */
    public final String getRelatedTransactionId() {
        return this.relatedTransactionId;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getAcquiringTaxPayment() {
        return this.acquiringTaxPayment;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final String getFundingStatus() {
        return this.fundingStatus;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: d1, reason: from getter */
    public final String getRewardReason() {
        return this.rewardReason;
    }

    @Override // xhf.h
    public final f e() {
        return this.aliasBeneficiary;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: e0, reason: from getter */
    public final Long getFundsTransferExpireTimeMillis() {
        return this.fundsTransferExpireTimeMillis;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: e1, reason: from getter */
    public final Boolean getSavingsVaultsBonus() {
        return this.savingsVaultsBonus;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.id, d1Var.id) && Intrinsics.f(this.legId, d1Var.legId) && Intrinsics.f(this.registeredIdentityId, d1Var.registeredIdentityId) && Intrinsics.f(this.type, d1Var.type) && Intrinsics.f(this.state, d1Var.state) && this.createdDate == d1Var.createdDate && this.startedDate == d1Var.startedDate && this.updatedDate == d1Var.updatedDate && Intrinsics.f(this.completedDate, d1Var.completedDate) && Intrinsics.f(this.currency, d1Var.currency) && this.amount == d1Var.amount && this.amountWithCharges == d1Var.amountWithCharges && Intrinsics.f(this.feeBreakdownId, d1Var.feeBreakdownId) && this.fee == d1Var.fee && this.exchangeFee == d1Var.exchangeFee && this.transferFee == d1Var.transferFee && Intrinsics.f(this.surcharge, d1Var.surcharge) && Intrinsics.f(this.balance, d1Var.balance) && Intrinsics.f(this.description, d1Var.description) && Intrinsics.f(this.reason, d1Var.reason) && Intrinsics.f(this.comment, d1Var.comment) && Intrinsics.f(this.ratings, d1Var.ratings) && Intrinsics.f(this.rejectComment, d1Var.rejectComment) && Intrinsics.f(this.category, d1Var.category) && Intrinsics.f(this.logo, d1Var.logo) && Intrinsics.f(this.relatedTransactionId, d1Var.relatedTransactionId) && Intrinsics.f(this.rate, d1Var.rate) && Intrinsics.f(this.merchant, d1Var.merchant) && Intrinsics.f(this.card, d1Var.card) && Intrinsics.f(this.fraudState, d1Var.fraudState) && Intrinsics.f(this.fraudReason, d1Var.fraudReason) && Intrinsics.f(this.posTime, d1Var.posTime) && Intrinsics.f(this.offline, d1Var.offline) && Intrinsics.f(this.cashbackBoxId, d1Var.cashbackBoxId) && Intrinsics.f(this.account, d1Var.account) && Intrinsics.f(this.direction, d1Var.direction) && Intrinsics.f(this.counterpart, d1Var.counterpart) && Intrinsics.f(this.autoInvest, d1Var.autoInvest) && Intrinsics.f(this.standingOrder, d1Var.standingOrder) && Intrinsics.f(this.stopOrder, d1Var.stopOrder) && Intrinsics.f(this.insurance, d1Var.insurance) && Intrinsics.f(this.recipient, d1Var.recipient) && Intrinsics.f(this.sender, d1Var.sender) && Intrinsics.f(this.profusion, d1Var.profusion) && Intrinsics.f(this.entryMode, d1Var.entryMode) && Intrinsics.f(this.transferLinkId, d1Var.transferLinkId) && Intrinsics.f(this.beneficiary, d1Var.beneficiary) && Intrinsics.f(this.beneficiaryFee, d1Var.beneficiaryFee) && Intrinsics.f(this.aliasBeneficiary, d1Var.aliasBeneficiary) && Intrinsics.f(this.gif, d1Var.gif) && Intrinsics.f(this.countryCode, d1Var.countryCode) && this.ecommerce == d1Var.ecommerce && Intrinsics.f(this.cardholderPresent, d1Var.cardholderPresent) && Intrinsics.f(this.loungePassIds, d1Var.loungePassIds) && Intrinsics.f(this.vault, d1Var.vault) && Intrinsics.f(this.billAccount, d1Var.billAccount) && Intrinsics.f(this.rateMarkupAmount, d1Var.rateMarkupAmount) && Intrinsics.f(this.rateMarkupAmountCurrency, d1Var.rateMarkupAmountCurrency) && Intrinsics.f(this.cryptoWithdrawDetails, d1Var.cryptoWithdrawDetails) && Intrinsics.f(this.cryptoDepositDetails, d1Var.cryptoDepositDetails) && Intrinsics.f(this.moneyRequest, d1Var.moneyRequest) && Intrinsics.f(this.localisedDescription, d1Var.localisedDescription) && Intrinsics.f(this.gift, d1Var.gift) && Intrinsics.f(this.transferType, d1Var.transferType) && Intrinsics.f(this.savingsVaultsBonus, d1Var.savingsVaultsBonus) && Intrinsics.f(this.loanRepayment, d1Var.loanRepayment) && Intrinsics.f(this.transparentPricing, d1Var.transparentPricing) && Intrinsics.f(this.feesBreakdown, d1Var.feesBreakdown) && Intrinsics.f(this.amountBreakdown, d1Var.amountBreakdown) && Intrinsics.f(this.cardOwner, d1Var.cardOwner) && Intrinsics.f(this.hotelBooking, d1Var.hotelBooking) && Intrinsics.f(this.cardVerification, d1Var.cardVerification) && Intrinsics.f(this.topupMethod, d1Var.topupMethod) && Intrinsics.f(this.isBusinessTransaction, d1Var.isBusinessTransaction) && Intrinsics.f(this.merchantPayment, d1Var.merchantPayment) && Intrinsics.f(this.instalmentPlan, d1Var.instalmentPlan) && Intrinsics.f(this.note, d1Var.note) && Intrinsics.f(this.chargebackEligible, d1Var.chargebackEligible) && Intrinsics.f(this.chargebackState, d1Var.chargebackState) && Intrinsics.f(this.chargebackUpdatedDate, d1Var.chargebackUpdatedDate) && Intrinsics.f(this.doxgetyReward, d1Var.doxgetyReward) && Intrinsics.f(this.junior, d1Var.junior) && Intrinsics.f(this.shops, d1Var.shops) && Intrinsics.f(this.userOfferId, d1Var.userOfferId) && Intrinsics.f(this.cashbackType, d1Var.cashbackType) && Intrinsics.f(this.charity, d1Var.charity) && Intrinsics.f(this.initiatedBy, d1Var.initiatedBy) && Intrinsics.f(this.joint, d1Var.joint) && Intrinsics.f(this.collectionTrading, d1Var.collectionTrading) && Intrinsics.f(this.payerName, d1Var.payerName) && Intrinsics.f(this.provisionalRefund, d1Var.provisionalRefund) && Intrinsics.f(this.accruedLoyaltyPointsAmount, d1Var.accruedLoyaltyPointsAmount) && Intrinsics.f(this.warrantReason, d1Var.warrantReason) && Intrinsics.f(this.wealthPortfolio, d1Var.wealthPortfolio) && Intrinsics.f(this.referralInviteId, d1Var.referralInviteId) && Intrinsics.f(this.referralReward, d1Var.referralReward) && Intrinsics.f(this.paidPlanTransactionInfo, d1Var.paidPlanTransactionInfo) && Intrinsics.f(this.creditCardCashbackCollection, d1Var.creditCardCashbackCollection) && Intrinsics.f(this.statementDeferralInstalment, d1Var.statementDeferralInstalment) && Intrinsics.f(this.prePurchaseInstalment, d1Var.prePurchaseInstalment) && Intrinsics.f(this.instalmentInfo, d1Var.instalmentInfo) && Intrinsics.f(this.fromAccount, d1Var.fromAccount) && Intrinsics.f(this.toAccount, d1Var.toAccount) && Intrinsics.f(this.apmContact, d1Var.apmContact) && Intrinsics.f(this.apmInfo, d1Var.apmInfo) && Intrinsics.f(this.stakingInfo, d1Var.stakingInfo) && Intrinsics.f(this.topupSource, d1Var.topupSource) && Intrinsics.f(this.edt, d1Var.edt) && Intrinsics.f(this.unblockDate, d1Var.unblockDate) && Intrinsics.f(this.acquiringCashback, d1Var.acquiringCashback) && Intrinsics.f(this.acquiringTaxPayment, d1Var.acquiringTaxPayment) && Intrinsics.f(this.canBeMarkedAsSubscription, d1Var.canBeMarkedAsSubscription) && Intrinsics.f(this.paymentScheme, d1Var.paymentScheme) && Intrinsics.f(this.localInstrument, d1Var.localInstrument) && Intrinsics.f(this.transactionCharges, d1Var.transactionCharges) && Intrinsics.f(this.taxDetails, d1Var.taxDetails) && Intrinsics.f(this.groupKey, d1Var.groupKey) && Intrinsics.f(this.linkedExchangeDetails, d1Var.linkedExchangeDetails) && Intrinsics.f(this.paymentCounterparty, d1Var.paymentCounterparty) && Intrinsics.f(this.digitizedCard, d1Var.digitizedCard) && Intrinsics.f(this.externalRegulator, d1Var.externalRegulator) && Intrinsics.f(this.originalAmount, d1Var.originalAmount) && Intrinsics.f(this.originalCurrency, d1Var.originalCurrency) && Intrinsics.f(this.paymentMethod, d1Var.paymentMethod) && Intrinsics.f(this.paymentAuthorisation, d1Var.paymentAuthorisation) && Intrinsics.f(this.equivalent, d1Var.equivalent) && Intrinsics.f(this.counterpartyDetailsGroup, d1Var.counterpartyDetailsGroup) && Intrinsics.f(this.fundsTransferExpireTimeMillis, d1Var.fundsTransferExpireTimeMillis) && Intrinsics.f(this.fundingStatus, d1Var.fundingStatus) && Intrinsics.f(this.splittable, d1Var.splittable) && Intrinsics.f(this.p2pPersonalisationId, d1Var.p2pPersonalisationId) && Intrinsics.f(this.paymentLinkId, d1Var.paymentLinkId) && Intrinsics.f(this.ledgerOrigin, d1Var.ledgerOrigin) && Intrinsics.f(this.rewardReason, d1Var.rewardReason) && Intrinsics.f(this.paymentInitiationType, d1Var.paymentInitiationType) && Intrinsics.f(this.defiMetadata, d1Var.defiMetadata) && Intrinsics.f(this.transferReasons, d1Var.transferReasons) && Intrinsics.f(this.guardian, d1Var.guardian);
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: f0, reason: from getter */
    public final String getGif() {
        return this.gif;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: f1, reason: from getter */
    public final g2 getSender() {
        return this.sender;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: g, reason: from getter */
    public final c getAmountBreakdown() {
        return this.amountBreakdown;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: g0, reason: from getter */
    public final f1 getGift() {
        return this.gift;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: g1, reason: from getter */
    public final w1 getShops() {
        return this.shops;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getAmountWithCharges() {
        return this.amountWithCharges;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: h0, reason: from getter */
    public final String getGroupKey() {
        return this.groupKey;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final Boolean getSplittable() {
        return this.splittable;
    }

    public final int hashCode() {
        int iC = p.a.c(this.id.hashCode() * 31, 31, this.legId);
        String str = this.registeredIdentityId;
        int iC2 = a0.d.c(a0.d.c(a0.d.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.type), 31, this.state), 31, this.createdDate), 31, this.startedDate), 31, this.updatedDate);
        Long l2 = this.completedDate;
        int iC3 = a0.d.c(a0.d.c(p.a.c((iC2 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.currency), 31, this.amount), 31, this.amountWithCharges);
        String str2 = this.feeBreakdownId;
        int iC4 = a0.d.c(a0.d.c(a0.d.c((iC3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.fee), 31, this.exchangeFee), 31, this.transferFee);
        Long l3 = this.surcharge;
        int iHashCode = (iC4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.balance;
        int iHashCode2 = (iHashCode + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reason;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.comment;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        q1 q1Var = this.ratings;
        int iHashCode6 = (iHashCode5 + (q1Var == null ? 0 : q1Var.hashCode())) * 31;
        String str6 = this.rejectComment;
        int iC5 = p.a.c((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.category);
        String str7 = this.logo;
        int iHashCode7 = (iC5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.relatedTransactionId;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d = this.rate;
        int iHashCode9 = (iHashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        m1 m1Var = this.merchant;
        int iHashCode10 = (iHashCode9 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        w0 w0Var = this.card;
        int iHashCode11 = (iHashCode10 + (w0Var == null ? 0 : w0Var.hashCode())) * 31;
        String str9 = this.fraudState;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.fraudReason;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l5 = this.posTime;
        int iHashCode14 = (iHashCode13 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Boolean bool = this.offline;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str11 = this.cashbackBoxId;
        int iHashCode16 = (this.account.hashCode() + ((iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31)) * 31;
        String str12 = this.direction;
        int iHashCode17 = (iHashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
        z0 z0Var = this.counterpart;
        int iHashCode18 = (iHashCode17 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        q0 q0Var = this.autoInvest;
        int iHashCode19 = (iHashCode18 + (q0Var == null ? 0 : q0Var.hashCode())) * 31;
        a2 a2Var = this.standingOrder;
        int iHashCode20 = (iHashCode19 + (a2Var == null ? 0 : a2Var.hashCode())) * 31;
        d2 d2Var = this.stopOrder;
        int iHashCode21 = (iHashCode20 + (d2Var == null ? 0 : d2Var.hashCode())) * 31;
        g1 g1Var = this.insurance;
        int iHashCode22 = (iHashCode21 + (g1Var == null ? 0 : g1Var.hashCode())) * 31;
        g2 g2Var = this.recipient;
        int iHashCode23 = (iHashCode22 + (g2Var == null ? 0 : g2Var.hashCode())) * 31;
        g2 g2Var2 = this.sender;
        int iHashCode24 = (iHashCode23 + (g2Var2 == null ? 0 : g2Var2.hashCode())) * 31;
        p1 p1Var = this.profusion;
        int iHashCode25 = (iHashCode24 + (p1Var == null ? 0 : p1Var.hashCode())) * 31;
        String str13 = this.entryMode;
        int iHashCode26 = (iHashCode25 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.transferLinkId;
        int iHashCode27 = (iHashCode26 + (str14 == null ? 0 : str14.hashCode())) * 31;
        s0 s0Var = this.beneficiary;
        int iHashCode28 = (iHashCode27 + (s0Var == null ? 0 : s0Var.hashCode())) * 31;
        t0 t0Var = this.beneficiaryFee;
        int iHashCode29 = (iHashCode28 + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        s0 s0Var2 = this.aliasBeneficiary;
        int iHashCode30 = (iHashCode29 + (s0Var2 == null ? 0 : s0Var2.hashCode())) * 31;
        String str15 = this.gif;
        int iHashCode31 = (iHashCode30 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.countryCode;
        int iC6 = j6.a.c((iHashCode31 + (str16 == null ? 0 : str16.hashCode())) * 31, 31, this.ecommerce);
        Boolean bool2 = this.cardholderPresent;
        int iHashCode32 = (iC6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list = this.loungePassIds;
        int iHashCode33 = (iHashCode32 + (list == null ? 0 : list.hashCode())) * 31;
        h2 h2Var = this.vault;
        int iHashCode34 = (iHashCode33 + (h2Var == null ? 0 : h2Var.hashCode())) * 31;
        u0 u0Var = this.billAccount;
        int iHashCode35 = (iHashCode34 + (u0Var == null ? 0 : u0Var.hashCode())) * 31;
        Long l22 = this.rateMarkupAmount;
        int iHashCode36 = (iHashCode35 + (l22 == null ? 0 : l22.hashCode())) * 31;
        String str17 = this.rateMarkupAmountCurrency;
        int iHashCode37 = (iHashCode36 + (str17 == null ? 0 : str17.hashCode())) * 31;
        t tVar = this.cryptoWithdrawDetails;
        int iHashCode38 = (iHashCode37 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        r rVar = this.cryptoDepositDetails;
        int iHashCode39 = (iHashCode38 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        x1 x1Var = this.moneyRequest;
        int iHashCode40 = (iHashCode39 + (x1Var == null ? 0 : x1Var.hashCode())) * 31;
        i1 i1Var = this.localisedDescription;
        int iHashCode41 = (iHashCode40 + (i1Var == null ? 0 : i1Var.hashCode())) * 31;
        f1 f1Var = this.gift;
        int iHashCode42 = (iHashCode41 + (f1Var == null ? 0 : f1Var.hashCode())) * 31;
        String str18 = this.transferType;
        int iHashCode43 = (iHashCode42 + (str18 == null ? 0 : str18.hashCode())) * 31;
        Boolean bool3 = this.savingsVaultsBonus;
        int iHashCode44 = (iHashCode43 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        i0 i0Var = this.loanRepayment;
        int iHashCode45 = (iHashCode44 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        Boolean bool4 = this.transparentPricing;
        int iHashCode46 = (iHashCode45 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        x xVar = this.feesBreakdown;
        int iHashCode47 = (iHashCode46 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        c cVar = this.amountBreakdown;
        int iHashCode48 = (iHashCode47 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        k kVar = this.cardOwner;
        int iHashCode49 = (iHashCode48 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        b0 b0Var = this.hotelBooking;
        int iHashCode50 = (iHashCode49 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        Boolean bool5 = this.cardVerification;
        int iHashCode51 = (iHashCode50 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str19 = this.topupMethod;
        int iHashCode52 = (iHashCode51 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Boolean bool6 = this.isBusinessTransaction;
        int iHashCode53 = (iHashCode52 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        o1 o1Var = this.merchantPayment;
        int iHashCode54 = (iHashCode53 + (o1Var == null ? 0 : o1Var.hashCode())) * 31;
        e0 e0Var = this.instalmentPlan;
        int iHashCode55 = (iHashCode54 + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        String str20 = this.note;
        int iHashCode56 = (iHashCode55 + (str20 == null ? 0 : str20.hashCode())) * 31;
        Boolean bool7 = this.chargebackEligible;
        int iHashCode57 = (iHashCode56 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        String str21 = this.chargebackState;
        int iHashCode58 = (iHashCode57 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Long l31 = this.chargebackUpdatedDate;
        int iHashCode59 = (iHashCode58 + (l31 == null ? 0 : l31.hashCode())) * 31;
        c1 c1Var = this.doxgetyReward;
        int iHashCode60 = (iHashCode59 + (c1Var == null ? 0 : c1Var.hashCode())) * 31;
        h1 h1Var = this.junior;
        int iHashCode61 = (iHashCode60 + (h1Var == null ? 0 : h1Var.hashCode())) * 31;
        w1 w1Var = this.shops;
        int iHashCode62 = (iHashCode61 + (w1Var == null ? 0 : w1Var.hashCode())) * 31;
        String str22 = this.userOfferId;
        int iHashCode63 = (iHashCode62 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.cashbackType;
        int iHashCode64 = (iHashCode63 + (str23 == null ? 0 : str23.hashCode())) * 31;
        y0 y0Var = this.charity;
        int iHashCode65 = (iHashCode64 + (y0Var == null ? 0 : y0Var.hashCode())) * 31;
        d0 d0Var = this.initiatedBy;
        int iHashCode66 = (iHashCode65 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        f0 f0Var = this.joint;
        int iHashCode67 = (iHashCode66 + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        l lVar = this.collectionTrading;
        int iHashCode68 = (iHashCode67 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        String str24 = this.payerName;
        int iHashCode69 = (iHashCode68 + (str24 == null ? 0 : str24.hashCode())) * 31;
        Boolean bool8 = this.provisionalRefund;
        int iHashCode70 = (iHashCode69 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Double d5 = this.accruedLoyaltyPointsAmount;
        int iHashCode71 = (iHashCode70 + (d5 == null ? 0 : d5.hashCode())) * 31;
        String str25 = this.warrantReason;
        int iHashCode72 = (iHashCode71 + (str25 == null ? 0 : str25.hashCode())) * 31;
        i2 i2Var = this.wealthPortfolio;
        int iHashCode73 = (iHashCode72 + (i2Var == null ? 0 : i2Var.hashCode())) * 31;
        String str26 = this.referralInviteId;
        int iHashCode74 = (iHashCode73 + (str26 == null ? 0 : str26.hashCode())) * 31;
        s1 s1Var = this.referralReward;
        int iHashCode75 = (iHashCode74 + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        m0 m0Var = this.paidPlanTransactionInfo;
        int iHashCode76 = (iHashCode75 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        Boolean bool9 = this.creditCardCashbackCollection;
        int iHashCode77 = (iHashCode76 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        o oVar = this.statementDeferralInstalment;
        int iHashCode78 = (iHashCode77 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        n nVar = this.prePurchaseInstalment;
        int iHashCode79 = (iHashCode78 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        m mVar = this.instalmentInfo;
        int iHashCode80 = (iHashCode79 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        a aVar = this.fromAccount;
        int iHashCode81 = (iHashCode80 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.toAccount;
        int iHashCode82 = (iHashCode81 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        d dVar = this.apmContact;
        int iHashCode83 = (iHashCode82 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.apmInfo;
        int iHashCode84 = (iHashCode83 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        z1 z1Var = this.stakingInfo;
        int iHashCode85 = (iHashCode84 + (z1Var == null ? 0 : z1Var.hashCode())) * 31;
        String str27 = this.topupSource;
        int iHashCode86 = (iHashCode85 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.edt;
        int iHashCode87 = (iHashCode86 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.unblockDate;
        int iHashCode88 = (iHashCode87 + (str29 == null ? 0 : str29.hashCode())) * 31;
        yhf.a aVar3 = this.acquiringCashback;
        int iHashCode89 = (iHashCode88 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        Boolean bool10 = this.acquiringTaxPayment;
        int iHashCode90 = (iHashCode89 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.canBeMarkedAsSubscription;
        int iHashCode91 = (iHashCode90 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        String str30 = this.paymentScheme;
        int iHashCode92 = (iHashCode91 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.localInstrument;
        int iHashCode93 = (iHashCode92 + (str31 == null ? 0 : str31.hashCode())) * 31;
        x0 x0Var = this.transactionCharges;
        int iHashCode94 = (iHashCode93 + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        e2 e2Var = this.taxDetails;
        int iHashCode95 = (iHashCode94 + (e2Var == null ? 0 : e2Var.hashCode())) * 31;
        String str32 = this.groupKey;
        int iHashCode96 = (iHashCode95 + (str32 == null ? 0 : str32.hashCode())) * 31;
        h0 h0Var = this.linkedExchangeDetails;
        int iHashCode97 = (iHashCode96 + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        o0 o0Var = this.paymentCounterparty;
        int iHashCode98 = (iHashCode97 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        a1 a1Var = this.digitizedCard;
        int iHashCode99 = (iHashCode98 + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        String str33 = this.externalRegulator;
        int iHashCode100 = (iHashCode99 + (str33 == null ? 0 : str33.hashCode())) * 31;
        Long l37 = this.originalAmount;
        int iHashCode101 = (iHashCode100 + (l37 == null ? 0 : l37.hashCode())) * 31;
        String str34 = this.originalCurrency;
        int iHashCode102 = (iHashCode101 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.paymentMethod;
        int iHashCode103 = (iHashCode102 + (str35 == null ? 0 : str35.hashCode())) * 31;
        n0 n0Var = this.paymentAuthorisation;
        int iHashCode104 = (iHashCode103 + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        v vVar = this.equivalent;
        int iHashCode105 = (iHashCode104 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        String str36 = this.counterpartyDetailsGroup;
        int iHashCode106 = (iHashCode105 + (str36 == null ? 0 : str36.hashCode())) * 31;
        Long l39 = this.fundsTransferExpireTimeMillis;
        int iHashCode107 = (iHashCode106 + (l39 == null ? 0 : l39.hashCode())) * 31;
        String str37 = this.fundingStatus;
        int iHashCode108 = (iHashCode107 + (str37 == null ? 0 : str37.hashCode())) * 31;
        Boolean bool12 = this.splittable;
        int iHashCode109 = (iHashCode108 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        String str38 = this.p2pPersonalisationId;
        int iHashCode110 = (iHashCode109 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.paymentLinkId;
        int iHashCode111 = (iHashCode110 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.ledgerOrigin;
        int iHashCode112 = (iHashCode111 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.rewardReason;
        int iHashCode113 = (iHashCode112 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.paymentInitiationType;
        int iHashCode114 = (iHashCode113 + (str42 == null ? 0 : str42.hashCode())) * 31;
        yhf.h hVar = this.defiMetadata;
        int iHashCode115 = (iHashCode114 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        gsf.m mVar2 = this.transferReasons;
        int iHashCode116 = (iHashCode115 + (mVar2 == null ? 0 : mVar2.hashCode())) * 31;
        a0 a0Var = this.guardian;
        return iHashCode116 + (a0Var != null ? a0Var.hashCode() : 0);
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: i, reason: from getter */
    public final d getApmContact() {
        return this.apmContact;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: i0, reason: from getter */
    public final a0 getGuardian() {
        return this.guardian;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: i1, reason: from getter */
    public final z1 getStakingInfo() {
        return this.stakingInfo;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: j, reason: from getter */
    public final e getApmInfo() {
        return this.apmInfo;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: j0, reason: from getter */
    public final b0 getHotelBooking() {
        return this.hotelBooking;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: j1, reason: from getter */
    public final a2 getStandingOrder() {
        return this.standingOrder;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: k, reason: from getter */
    public final q0 getAutoInvest() {
        return this.autoInvest;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: k0, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: k1, reason: from getter */
    public final long getStartedDate() {
        return this.startedDate;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: l, reason: from getter */
    public final Long getBalance() {
        return this.balance;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: l0, reason: from getter */
    public final d0 getInitiatedBy() {
        return this.initiatedBy;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: l1, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @Override // xhf.h
    public final f m() {
        return this.beneficiary;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: m0, reason: from getter */
    public final m getInstalmentInfo() {
        return this.instalmentInfo;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: m1, reason: from getter */
    public final o getStatementDeferralInstalment() {
        return this.statementDeferralInstalment;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: n, reason: from getter */
    public final t0 getBeneficiaryFee() {
        return this.beneficiaryFee;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: n0, reason: from getter */
    public final e0 getInstalmentPlan() {
        return this.instalmentPlan;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final d2 getStopOrder() {
        return this.stopOrder;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: o, reason: from getter */
    public final u0 getBillAccount() {
        return this.billAccount;
    }

    @Override // xhf.h
    public final i o0() {
        return this.insurance;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: o1, reason: from getter */
    public final Long getSurcharge() {
        return this.surcharge;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: p, reason: from getter */
    public final Boolean getCanBeMarkedAsSubscription() {
        return this.canBeMarkedAsSubscription;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: p0, reason: from getter */
    public final f0 getJoint() {
        return this.joint;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: p1, reason: from getter */
    public final e2 getTaxDetails() {
        return this.taxDetails;
    }

    @Override // xhf.h
    public final g q() {
        return this.card;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: q0, reason: from getter */
    public final h1 getJunior() {
        return this.junior;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: q1, reason: from getter */
    public final a getToAccount() {
        return this.toAccount;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: r, reason: from getter */
    public final k getCardOwner() {
        return this.cardOwner;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: r0, reason: from getter */
    public final String getLedgerOrigin() {
        return this.ledgerOrigin;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: r1, reason: from getter */
    public final String getTopupMethod() {
        return this.topupMethod;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: s, reason: from getter */
    public final Boolean getCardVerification() {
        return this.cardVerification;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: s0, reason: from getter */
    public final String getLegId() {
        return this.legId;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: s1, reason: from getter */
    public final String getTopupSource() {
        return this.topupSource;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: t, reason: from getter */
    public final Boolean getCardholderPresent() {
        return this.cardholderPresent;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: t0, reason: from getter */
    public final h0 getLinkedExchangeDetails() {
        return this.linkedExchangeDetails;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: t1, reason: from getter */
    public final x0 getTransactionCharges() {
        return this.transactionCharges;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getCashbackBoxId() {
        return this.cashbackBoxId;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: u0, reason: from getter */
    public final i0 getLoanRepayment() {
        return this.loanRepayment;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: u1, reason: from getter */
    public final long getTransferFee() {
        return this.transferFee;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getCashbackType() {
        return this.cashbackType;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: v0, reason: from getter */
    public final String getLocalInstrument() {
        return this.localInstrument;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: v1, reason: from getter */
    public final String getTransferLinkId() {
        return this.transferLinkId;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: w, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: w0, reason: from getter */
    public final i1 getLocalisedDescription() {
        return this.localisedDescription;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: w1, reason: from getter */
    public final gsf.m getTransferReasons() {
        return this.transferReasons;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: x, reason: from getter */
    public final Boolean getChargebackEligible() {
        return this.chargebackEligible;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: x1, reason: from getter */
    public final String getTransferType() {
        return this.transferType;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getChargebackState() {
        return this.chargebackState;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: y0, reason: from getter */
    public final List getLoungePassIds() {
        return this.loungePassIds;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: y1, reason: from getter */
    public final Boolean getTransparentPricing() {
        return this.transparentPricing;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: z, reason: from getter */
    public final Long getChargebackUpdatedDate() {
        return this.chargebackUpdatedDate;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: z0, reason: from getter */
    public final m1 getMerchant() {
        return this.merchant;
    }

    @Override // xhf.h
    /* JADX INFO: renamed from: z1, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
